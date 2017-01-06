package com.javase.jaxws.soap.impl;

import com.javase.jaxws.soap.HelloService;

import javax.jws.WebService;

/**
 * Created by root on 11/26/16.
 */
@WebService(
        serviceName = "HelloService",
        portName = "HelloServicePort",
        endpointInterface = "com.javase.jaxws.soap.HelloService"
)

public class HelloServiceImpl implements HelloService{
    public String say(String name) {
        return "hello " + name;
    }
}
