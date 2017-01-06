package com.javase.cxf.spring.soap.impl;

import com.javase.cxf.soap.HelloService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * Created by root on 11/26/16.
 */
@WebService
@Component
public class HelloServiceImpl implements HelloService {
    public String say(String name) {
        return "hello " + name;
    }
}
