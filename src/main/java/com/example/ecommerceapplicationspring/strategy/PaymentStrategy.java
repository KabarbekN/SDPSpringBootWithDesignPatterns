package com.example.ecommerceapplicationspring.strategy;


import org.springframework.stereotype.Component;

@Component
public interface PaymentStrategy {
    void pay();
}
