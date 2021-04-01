package com.penghy.server.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


/**
 * WebService
 * 将 Java 类标记为实现 Web Service，或者将 Java 接口标记为定义 Web Service 接口
 */
@Component
@WebService
public class HelloWebService2 {

    @WebResult(name = "myReturn")
    public String sayHello(@WebParam(name = "name") String name) {
        return "hello2: " + name;
    }

    public String sayGoodbye(String name) {

        return "goodbye2: " + name;
    }

    public String sayHello2(String name) {
        return "hello2 ，欢迎来到德莱联盟：" + name;
    }

}
