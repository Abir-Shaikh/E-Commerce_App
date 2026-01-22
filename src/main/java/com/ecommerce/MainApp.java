package com.ecommerce;

import com.ecommerce.Controller.ProductController;
import com.ecommerce.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductController productController = context.getBean(ProductController.class);

        productController.buyProduct();
    }
}




//This is:
//
//Entry point of Java program
//
//Starts Spring container
//
//Requests controller bean
//
//Without this → nothing runs.