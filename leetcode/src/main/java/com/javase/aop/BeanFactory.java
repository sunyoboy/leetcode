package com.javase.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by DD240 on 2016/11/15.
 */
public class BeanFactory {
    public static Object getBean(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Object obj = Class.forName(className).newInstance();
        InvocationHandler handler = new AOPHandler(obj); // 定义过滤器
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                handler);
    }

    @SuppressWarnings("unchecked")
    public static<T> T getBean(String className, Class<T> clazz) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (T)getBean(className);
    }
}
