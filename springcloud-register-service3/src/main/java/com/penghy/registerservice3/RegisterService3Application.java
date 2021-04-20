package com.penghy.registerservice3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan({"com.*"})
public class RegisterService3Application {

    public static void main(String[] args) {
        SpringApplication.run(RegisterService3Application.class, args);
    }

}
