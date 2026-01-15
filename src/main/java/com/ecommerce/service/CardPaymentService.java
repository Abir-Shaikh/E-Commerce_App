package com.ecommerce.service;

import org.springframework.stereotype.Service;

@Service("cardPayment")
public class CardPaymentService implements PaymentService{
    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done using card");
    }
}
