package com.sentilab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //startApp이라는게 가장 먼저 실행되는거야 라는 어노테이션
public class startApp {
    public static void main(String[] args) {
        SpringApplication.run(startApp.class, args);
    }
}
