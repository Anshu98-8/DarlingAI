package com.CodingBrajmohan.DarlingAI.mapper;

import com.CodingBrajmohan.DarlingAI.dto.subscription.PlanResponse;
import com.CodingBrajmohan.DarlingAI.dto.subscription.SubscriptionResponse;
import com.CodingBrajmohan.DarlingAI.entity.Plan;
import com.CodingBrajmohan.DarlingAI.entity.Subscription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    SubscriptionResponse toSubscriptionResponse(Subscription subscription);

    PlanResponse toPlanResponse(Plan plan);
}
