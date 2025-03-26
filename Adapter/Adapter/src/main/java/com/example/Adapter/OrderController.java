package com.example.Adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderFacade orderFacade;

    @Autowired
    public OrderController(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }

    @PostMapping("/place")
    public ResponseEntity<String> placeOrder(@RequestParam String paymentMethod) {
        orderFacade.placeOrder(paymentMethod);
        return ResponseEntity.ok("Order Placed Successfully");
    }
}