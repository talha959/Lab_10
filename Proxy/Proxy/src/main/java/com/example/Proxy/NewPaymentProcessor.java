package com.example.Proxy;

public interface NewPaymentProcessor {
    void processPayment(String cardNumber, double amount);
}