package com.penghy.bootadminclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudBootAdminClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudBootAdminClientApplication.class, args);
    }

}
