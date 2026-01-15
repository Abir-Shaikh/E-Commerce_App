package com.ecommerce.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    public void saveProduct(String product){
        System.out.println("Product saved in cart : " + product);
    }
}


//talks to the database
//should not contain business logic
//should not know about payment details