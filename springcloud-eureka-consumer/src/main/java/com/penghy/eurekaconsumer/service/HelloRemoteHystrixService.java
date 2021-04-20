package com.penghy.eurekaconsumer.service;

import com.penghy.eurekaconsumer.service.impl.HelloRemoteHystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "springcloud-eureka-producer", contextId = "HelloRemoteHystrixService", fallback = HelloRemoteHystrixServiceImpl.class)
public interface HelloRemoteHystrixService {
    @RequestMapping(method = RequestMethod.GET,value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
