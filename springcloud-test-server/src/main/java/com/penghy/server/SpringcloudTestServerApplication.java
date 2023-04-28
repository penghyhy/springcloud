package com.penghy.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringcloudTestServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudTestServerApplication.class, args);
    }

}
