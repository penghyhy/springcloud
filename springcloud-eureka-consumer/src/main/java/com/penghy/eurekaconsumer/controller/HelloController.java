package com.penghy.eurekaconsumer.controller;

import com.penghy.eurekaconsumer.service.HelloRemoteHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloRemoteHystrixService helloRemoteHystrixService;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemoteHystrixService.hello(name);
    }
}
