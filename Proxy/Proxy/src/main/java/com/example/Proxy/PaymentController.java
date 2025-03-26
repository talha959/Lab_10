package com.example.Proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private final NewPaymentProcessor paymentProcessor;

    @Autowired
    public PaymentController(PaymentAdapter paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    @PostMapping("/pay")
    public ResponseEntity<String> processPayment(@RequestParam String cardNumber, @RequestParam double amount) {
        paymentProcessor.processPayment(cardNumber, amount);
        return ResponseEntity.ok("Payment Successful");
    }
}
