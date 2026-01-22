package com.ecommerce.service;

import com.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Autowired
    @Qualifier("cardPayment") // ambiguity resolved here why? cuz we are particularly asking about upi payment
    private PaymentService paymentService;

    public void orderProduct(String product , double price){
        productRepository.saveProduct(product);
        paymentService.pay(price);
        System.out.println("Order placed successfully for " + product);
    }
}
