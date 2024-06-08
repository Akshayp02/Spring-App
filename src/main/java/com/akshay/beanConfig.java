package com.akshay;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.akshay")
public class beanConfig {

    @Bean
    public Doctor doctor(){
        return new Doctor();
    }

}
