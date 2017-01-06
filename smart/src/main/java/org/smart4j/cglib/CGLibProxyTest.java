package org.smart4j.cglib;

/**
 * Created by root on 11/28/16.
 */
public class CGLibProxyTest {
    public static void main(String[] args) {
        CGLibProxy gcLibProxy = new CGLibProxy();
        Hello hello = gcLibProxy.getProxy(HelloImpl.class);
        hello.say("Hello World!");
    }
}
