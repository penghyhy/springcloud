package com.phy.client.controller;

import com.phy.client.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebClientController {
    @Autowired
    private TestService testService;


    @GetMapping(path = "client2")
    public String client2() {
        System.out.println("GetIn");
        String webUrl = "http://localhost:9003/penghy/HelloWebservice2?wsdl";
        String methodName = "sayHello2";
        System.out.println("Calling" + webUrl);
        String returnString = "";
        try {
            returnString  = testService.callWebSV(webUrl, methodName, "小米");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Called");
        return returnString;
    }
    @GetMapping(path = "client1")
    public String websv() {
        System.out.println("GetIn");
        String webUrl = "http://localhost:9003/penghy/HelloWebservice1?wsdl";
        String methodName = "sayHello2";
        System.out.println("Calling" + webUrl);
        String returnString = "";
        try {
            returnString  = testService.callWebSV(webUrl, methodName, "小彭彭");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Called");
        return returnString;
    }

}
