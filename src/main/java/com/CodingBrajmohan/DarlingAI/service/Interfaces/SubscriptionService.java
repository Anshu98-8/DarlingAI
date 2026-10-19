package com.CodingBrajmohan.DarlingAI.service.Interfaces;

import com.CodingBrajmohan.DarlingAI.dto.subscription.CheckoutRequest;
import com.CodingBrajmohan.DarlingAI.dto.subscription.CheckoutResponse;
import com.CodingBrajmohan.DarlingAI.dto.subscription.PortalResponse;
import com.CodingBrajmohan.DarlingAI.dto.subscription.SubscriptionResponse;
import com.CodingBrajmohan.DarlingAI.enums.SubscriptionStatus;

import java.time.Instant;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription();

    void activateSubscription(Long userId, Long planId, String subscriptionId, String customerId);

    void updateSubscription(String subscriptionId, SubscriptionStatus status, Instant periodStart, Instant periodEnd, Boolean cancelAtPeriodEnd, Long planId);

    void cancelSubscription(String subscriptionId);

    void renewSubscriptionPeriod(String subId, Instant periodStart, Instant periodEnd);

    void markSubscriptionPastDue(String subId);
}
