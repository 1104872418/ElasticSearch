package com.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Spring Boot核心注解，用于开启自动配置
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
