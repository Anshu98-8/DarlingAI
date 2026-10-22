package com.CodingBrajmohan.DarlingAI.controller;

import com.CodingBrajmohan.DarlingAI.dto.subscription.PlanLimitsResponse;
import com.CodingBrajmohan.DarlingAI.dto.subscription.UsageTodayResponse;
import com.CodingBrajmohan.DarlingAI.service.Interfaces.UsageService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/usage")
public class UsageController {

    private final UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse> getTodayUsage() {
        Long userId = 1L;
//        return ResponseEntity.ok(usageService.getTodayUsageOfUser(userId));
        return null;
    }

}