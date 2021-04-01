package com.penghy.server.controller;


import com.penghy.server.model.UserVo;
import com.penghy.server.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;


    @ResponseBody
    @RequestMapping("/hello")
    public String hello(String name) {
        return name + ", Welcome to Spring Boot 2";
    }



    @RequestMapping("/select")
    public List<UserVo> select() throws Exception {
        return userInfoService.select();
    }

}
