package com.kevle0215.service;

import com.kevle0215.model.Order;
import com.kevle0215.response.PaymentResponse;
import com.stripe.exception.StripeException;

public interface PaymentService {

    public PaymentResponse createPaymentLink(Order order) throws StripeException;
    
}
