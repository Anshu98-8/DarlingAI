package com.CodingBrajmohan.DarlingAI.service.Implementation;

import com.CodingBrajmohan.DarlingAI.dto.subscription.PlanResponse;
import com.CodingBrajmohan.DarlingAI.service.Interfaces.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
