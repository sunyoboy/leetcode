package com.javase.cxf.soap;

import com.javase.cxf.soap.impl.HelloServiceImpl;
import org.apache.cxf.frontend.ServerFactoryBean;

/**
 * Created by root on 11/26/16.
 */
public class SimpleServer {
    public static void main(String[] args) {
        ServerFactoryBean factoryBean = new ServerFactoryBean();
        factoryBean.setAddress("http://localhost:8080/ws/soap/hello");
        factoryBean.setServiceClass(HelloService.class);
        factoryBean.setServiceBean(new HelloServiceImpl());
        factoryBean.create();
        System.out.println("soap ws is published");
    }
}
