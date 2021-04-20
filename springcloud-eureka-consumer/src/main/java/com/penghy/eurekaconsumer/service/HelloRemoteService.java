package com.penghy.eurekaconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "springcloud-eureka-producer", contextId = "HelloRemoteService")
public interface HelloRemoteService {
    @RequestMapping(value = "hello")
    String hello(@RequestParam(value = "name") String name);
}
