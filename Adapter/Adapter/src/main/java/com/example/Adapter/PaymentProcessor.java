package com.example.Adapter;

import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {
    public void processPayment(String paymentMethod) {
        System.out.println("Processing payment using: " + paymentMethod);
    }
}
