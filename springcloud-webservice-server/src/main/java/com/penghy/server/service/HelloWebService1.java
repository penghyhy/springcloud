package com.penghy.server.service;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * WebService
 * 将 Java 类标记为实现 Web Service，或者将 Java 接口标记为定义 Web Service 接口
 */
@Component
@WebService
public class HelloWebService1 {

    @WebResult(name="myReturn")
    public String sayHello(@WebParam(name="name") String name){
        return  "hello2: " + name;
    }

    public String sayGoodbye(String name){

        return  "goodbye2: " + name;
    }

//    @WebMethod(exclude=true)//当前方法不被发布出去
    public String sayHello2(String name){
        return "hello2 ，欢迎来到德莱联盟：" + name;
    }


//    //通过EndPoint(端点服务)发布一个WebService
//    public static void main(String[] args) {
//     /*参数:1,本地的服务地址;
//           2,提供服务的类;
//      */
//        Endpoint.publish("http://localhost:9001/Service/ServiceHello", new HelloWebService());
//        System.out.println("发布成功!");
//        //发布成功后 在浏览器输入 http://localhost:9001/Service/ServiceHello?wsdl
//    }
}
