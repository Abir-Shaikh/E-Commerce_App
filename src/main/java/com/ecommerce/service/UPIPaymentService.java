package com.ecommerce.service;

import org.springframework.stereotype.Service;

@Service("upiPayment")
public class UPIPaymentService implements PaymentService{
    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done using UPI");
    }
}
