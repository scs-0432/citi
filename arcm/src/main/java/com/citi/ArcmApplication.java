package com.citi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ArcmApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArcmApplication.class, args);
    }
}
