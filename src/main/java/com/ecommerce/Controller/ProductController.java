package com.ecommerce.Controller;

import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    public void buyProduct(){
        productService.orderProduct("Laptop" , 60000);
    }
}




//Controller:
//
//Represents user action
//
//Should not contain business logic
//
//Should not talk to repository directly