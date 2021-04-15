package com.penghy.bootadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableAdminServer
public class SpringcloudBootAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudBootAdminServerApplication.class, args);
    }

}
