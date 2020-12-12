package com.itheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication(scanBasePackages = "com.itheng")
public class SpringBootSlyThymeleaf02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSlyThymeleaf02Application.class, args);
    }

}
