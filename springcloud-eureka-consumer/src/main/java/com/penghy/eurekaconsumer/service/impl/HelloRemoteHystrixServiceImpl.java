package com.penghy.eurekaconsumer.service.impl;

import com.penghy.eurekaconsumer.service.HelloRemoteHystrixService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrixServiceImpl implements HelloRemoteHystrixService {
    private static final Logger logger = LoggerFactory.getLogger(HelloRemoteHystrixServiceImpl.class);

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        logger.info("name:{}",name);
        return "hello" +name+", this messge send failed ";
    }
}
