package com.javase.cxf.soap.impl;

import com.javase.cxf.soap.HelloService;

import javax.jws.WebService;

/**
 * Created by root on 11/26/16.
 */
@WebService
public class HelloServiceImpl implements HelloService {
    public String say(String name) {
        return "hello " + name;
    }
}
