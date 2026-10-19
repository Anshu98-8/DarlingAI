package com.CodingBrajmohan.DarlingAI.service.Interfaces;

import com.CodingBrajmohan.DarlingAI.dto.subscription.CheckoutRequest;
import com.CodingBrajmohan.DarlingAI.dto.subscription.CheckoutResponse;
import com.CodingBrajmohan.DarlingAI.dto.subscription.PortalResponse;
import com.stripe.model.StripeObject;

import java.util.Map;

public interface PaymentProcessor {

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request);

    PortalResponse openCustomerPortal();

    void handleWebhookEvent(String type, StripeObject stripeObject, Map<String, String> metadata);
}
