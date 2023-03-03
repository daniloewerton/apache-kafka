package com.daniloewerton.paymentservice.service;

import com.daniloewerton.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
