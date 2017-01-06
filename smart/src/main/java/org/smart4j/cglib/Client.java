package org.smart4j.cglib;

/**
 * Created by root on 11/28/16.
 */
public class Client {
    public static void main(String[] args) {
        Hello hello = new JDKDynamicProxy(new HelloImpl()).getProxy();
        hello.say("Hello World!");
    }
}
