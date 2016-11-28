package org.smart4j.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by root on 11/28/16.
 */
public class CGLibProxySingleton implements MethodInterceptor {

    private static CGLibProxySingleton singleton = new CGLibProxySingleton();

    private CGLibProxySingleton() {

    }

    public static CGLibProxySingleton getCGLibProxySingleton() {
        return singleton;
    }

    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
        afer();
        return result;
    }

    public void before() {
        System.out.println("before");
    }

    public void afer() {
        System.out.println("after");
    }
}
