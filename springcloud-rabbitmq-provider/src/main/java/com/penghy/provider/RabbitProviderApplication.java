package com.penghy.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RabbitProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitProviderApplication.class, args);
    }

}
