package com.ecommerce.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ecommerce")
public class AppConfig {
}



//This class:
//
//Tells Spring where to scan
//
//Enables annotation-based DI
//
//Replaces XML configuration
