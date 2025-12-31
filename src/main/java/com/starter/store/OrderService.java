package com.starter.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// @Service
public class OrderService {
    private PaymentService paymentService;

    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService Created");
    }

    @PostConstruct
    public void init() {
        System.out.println("OrderService PostConstruct");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("OrderServuce PreDestroy");
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
}
