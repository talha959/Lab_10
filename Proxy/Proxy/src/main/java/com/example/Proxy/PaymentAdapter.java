package com.example.Proxy;

import org.springframework.stereotype.Component;

@Component
public class PaymentAdapter implements NewPaymentProcessor {
    private final OldPaymentGateway oldPaymentGateway;

    public PaymentAdapter() {
        this.oldPaymentGateway = new OldPaymentGateway();
    }

    @Override
    public void processPayment(String cardNumber, double amount) {
        oldPaymentGateway.payWithCard(cardNumber, amount);
    }
}