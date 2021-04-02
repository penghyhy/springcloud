package com.penghy.client.cotroller;


import com.penghy.client.service.PersonService;

import javax.xml.ws.Endpoint;

public class UserProvider {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8080/user", new PersonService());
        System.out.println("userService publihser...");
    }
}
