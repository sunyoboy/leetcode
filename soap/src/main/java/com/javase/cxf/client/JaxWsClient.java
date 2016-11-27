package com.javase.cxf.client;

import com.javase.cxf.soap.HelloService;
import com.javase.cxf.soap.JaxWsServer;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by root on 11/27/16.
 */
public class JaxWsClient {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setAddress("http://localhost:8080/ws/soap/hello");
        factoryBean.setServiceClass(HelloService.class);

        HelloService helloService = factoryBean.create(HelloService.class);
        String result = helloService.say("world!");
        System.out.println(result);
    }
}
