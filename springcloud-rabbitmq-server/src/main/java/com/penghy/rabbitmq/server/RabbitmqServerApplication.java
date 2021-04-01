package com.penghy.rabbitmq.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RabbitmqServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqServerApplication.class, args);
    }

}
