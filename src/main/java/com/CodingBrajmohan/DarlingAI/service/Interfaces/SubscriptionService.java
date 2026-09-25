package com.CodingBrajmohan.DarlingAI.service.Interfaces;

import com.CodingBrajmohan.DarlingAI.dto.subscription.CheckoutRequest;
import com.CodingBrajmohan.DarlingAI.dto.subscription.CheckoutResponse;
import com.CodingBrajmohan.DarlingAI.dto.subscription.PortalResponse;
import com.CodingBrajmohan.DarlingAI.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
