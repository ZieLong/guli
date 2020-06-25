package com.hqu.eduservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hqu"})
public class EduApplicatin {
    public static void main(String[] args) {
        SpringApplication.run(EduApplicatin.class, args);
    }
}
