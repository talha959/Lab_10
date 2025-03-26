package com.example.Proxy;

public class OldPaymentGateway {
    public void payWithCard(String cardNumber, double amount) {
        System.out.println("Payment of $" + amount + " made using card: " + cardNumber);
    }
}