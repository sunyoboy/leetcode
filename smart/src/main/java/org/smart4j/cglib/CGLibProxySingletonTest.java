package org.smart4j.cglib;

/**
 * Created by root on 11/28/16.
 */
public class CGLibProxySingletonTest {
    public static void main(String[] args) {
        Hello hello = CGLibProxySingleton.getCGLibProxySingleton().getProxy(HelloImpl.class);
        hello.say("HelloWorld");
    }
}
