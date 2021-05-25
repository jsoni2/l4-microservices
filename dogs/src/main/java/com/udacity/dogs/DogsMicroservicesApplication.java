package com.udacity.dogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DogsMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DogsMicroservicesApplication.class, args);
    }

}
