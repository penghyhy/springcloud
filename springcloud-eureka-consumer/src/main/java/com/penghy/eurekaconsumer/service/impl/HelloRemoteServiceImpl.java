package com.penghy.eurekaconsumer.service.impl;

import com.penghy.eurekaconsumer.service.HelloRemoteService;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class HelloRemoteServiceImpl implements HelloRemoteService {
    @Override
    public String hello(String name) {
        return "aaaa"+name;
    }
}
