package com.daniloewerton.paymentservice.resource.impl;

import com.daniloewerton.paymentservice.model.Payment;
import com.daniloewerton.paymentservice.resource.PaymentResource;
import com.daniloewerton.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/payments")
public class PaymentResourceImpl implements PaymentResource {

    private final PaymentService service;

    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        service.sendPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
