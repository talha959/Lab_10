package com.example.Adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderFacade {
    private final ProductCatalog productCatalog;
    private final PaymentProcessor paymentProcessor;
    private final OrderManager orderManager;

    @Autowired
    public OrderFacade(ProductCatalog productCatalog, PaymentProcessor paymentProcessor, OrderManager orderManager) {
        this.productCatalog = productCatalog;
        this.paymentProcessor = paymentProcessor;
        this.orderManager = orderManager;
    }

    public void placeOrder(String paymentMethod) {
        productCatalog.displayProducts();
        paymentProcessor.processPayment(paymentMethod);
        orderManager.createOrder();
        System.out.println("Order placed successfully!");
    }
}