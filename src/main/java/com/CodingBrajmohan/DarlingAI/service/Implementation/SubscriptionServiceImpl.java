package com.CodingBrajmohan.DarlingAI.service.Implementation;

import com.CodingBrajmohan.DarlingAI.dto.subscription.CheckoutRequest;
import com.CodingBrajmohan.DarlingAI.dto.subscription.CheckoutResponse;
import com.CodingBrajmohan.DarlingAI.dto.subscription.PortalResponse;
import com.CodingBrajmohan.DarlingAI.dto.subscription.SubscriptionResponse;
import com.CodingBrajmohan.DarlingAI.service.Interfaces.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
