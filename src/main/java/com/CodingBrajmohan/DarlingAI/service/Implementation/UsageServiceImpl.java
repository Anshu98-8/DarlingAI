package com.CodingBrajmohan.DarlingAI.service.Implementation;

import com.CodingBrajmohan.DarlingAI.dto.subscription.PlanLimitsResponse;
import com.CodingBrajmohan.DarlingAI.dto.subscription.PlanResponse;
import com.CodingBrajmohan.DarlingAI.dto.subscription.SubscriptionResponse;
import com.CodingBrajmohan.DarlingAI.dto.subscription.UsageTodayResponse;
import com.CodingBrajmohan.DarlingAI.entity.UsageLog;
import com.CodingBrajmohan.DarlingAI.repository.UsageLogRepository;
import com.CodingBrajmohan.DarlingAI.security.AuthUtil;
import com.CodingBrajmohan.DarlingAI.service.Interfaces.SubscriptionService;
import com.CodingBrajmohan.DarlingAI.service.Interfaces.UsageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;

@RequiredArgsConstructor
@Service
public class UsageServiceImpl implements UsageService {

    private final UsageLogRepository usageLogRepository;
    private final AuthUtil authUtil;
    private final SubscriptionService subscriptionService;

    @Override
    public void recordTokenUsage(Long userId, int actualTokens) {
        LocalDate today = LocalDate.now();

        UsageLog todayLog = usageLogRepository.findByUserIdAndDate(userId, today).
                orElseGet(() -> createNewDailyLog(userId, today));

        todayLog.setTokensUsed(todayLog.getTokensUsed() + actualTokens);
        usageLogRepository.save(todayLog);
    }

    @Override
    public void checkDailyTokensUsage() {
        Long userId = authUtil.getCurrentUserId();
        SubscriptionResponse subscriptionResponse = subscriptionService.getCurrentSubscription();
        PlanResponse plan = subscriptionResponse.plan();

        LocalDate today = LocalDate.now();

        UsageLog todayLog = usageLogRepository.findByUserIdAndDate(userId, today).
                orElseGet(() -> createNewDailyLog(userId, today));

        if(plan.unlimitedAi()) return;

        int currentUsage = todayLog.getTokensUsed();
        int limit = plan.maxTokensPerDay();

        if(currentUsage >=  limit) {
            throw new ResponseStatusException(HttpStatus.TOO_MANY_REQUESTS,
                    "Daily limit reached, Upgrade now");
        }

    }

    private UsageLog createNewDailyLog(Long userId, LocalDate date) {
        UsageLog newLog = UsageLog.builder()
                .userId(userId)
                .date(date)
                .tokensUsed(0)
                .build();
        return usageLogRepository.save(newLog);
    }
}
