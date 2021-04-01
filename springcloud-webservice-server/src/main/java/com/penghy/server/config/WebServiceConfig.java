package com.penghy.server.config;

import com.penghy.server.service.HelloWebService1;
import com.penghy.server.service.HelloWebService2;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;


@Configuration
public class WebServiceConfig {
    @Autowired
    private Bus bus;

    @Autowired
    private HelloWebService2 helloWebService2;
    @Autowired
    private HelloWebService1 helloWebService1;

    @Bean
    public ServletRegistrationBean wsServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new CXFServlet(), "/penghy/*");

        return bean;
    }


    /** JAX-WS **/
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, helloWebService1);
        endpoint.publish("/HelloWebservice1");
        return endpoint;
    }
    @Bean
    public Endpoint endpoint2() {
        EndpointImpl endpoint = new EndpointImpl(bus, helloWebService2);
        endpoint.publish("/HelloWebservice2");
        return endpoint;
    }
}
