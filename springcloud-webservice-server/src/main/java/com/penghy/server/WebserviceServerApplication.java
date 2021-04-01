package com.penghy.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WebserviceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebserviceServerApplication.class, args);
    }

}
