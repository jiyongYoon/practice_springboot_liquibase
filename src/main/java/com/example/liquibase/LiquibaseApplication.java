package com.example.liquibase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LiquibaseApplication {

    @Value("${spring.datasource.url}")
    private String url;

    public static void main(String[] args) {
        SpringApplication.run(LiquibaseApplication.class, args);
    }

    @Bean
    public ApplicationRunner printUrl() {
        return args -> {
            System.out.println("Database URL: " + url);
        };
    }
}
