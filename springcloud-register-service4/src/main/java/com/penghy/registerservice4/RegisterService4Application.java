package com.penghy.registerservice4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegisterService4Application {

    public static void main(String[] args) {
        SpringApplication.run(RegisterService4Application.class, args);
    }

}
