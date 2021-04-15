package com.penghy.bootadminclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("api")
public class ClientController {
    private AtomicInteger count = new AtomicInteger(0);

    @GetMapping("hi")
    private String sayHi() {
        // 每次进来如打印下日志
        System.out.println( LocalDateTime.now()+" 啪...我第"+ count.addAndGet(1)+"次进来了.");
        // 每次进来new 个大对象，便于监控观察堆内存变化
        byte[] bytes = new byte[100 * 1024 * 1024];
        return "hi springboot addmin " + LocalDateTime.now();
    }
}
