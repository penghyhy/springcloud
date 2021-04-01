package com.phy.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WebserviceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebserviceClientApplication.class, args);
    }

}
