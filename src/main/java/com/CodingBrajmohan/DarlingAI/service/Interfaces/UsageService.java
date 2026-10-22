package com.CodingBrajmohan.DarlingAI.service.Interfaces;

import com.CodingBrajmohan.DarlingAI.dto.subscription.PlanLimitsResponse;
import com.CodingBrajmohan.DarlingAI.dto.subscription.UsageTodayResponse;

public interface UsageService {
    void recordTokenUsage(Long userId, int actualTokens);
    void checkDailyTokensUsage();
}
