package com.javase.aop;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by DD240 on 2016/11/15.
 */
public class AopMain {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        HelloInterface hello = BeanFactory.getBean("com.javase.leetcode.aop.HelloImpl", HelloInterface.class);
        hello.setInfo("xueyou", "xiaopang");

        Method method = HelloInterface.class.getDeclaredMethod("setInfo", String.class, String.class);
        method.invoke(new HelloImpl(), "aaa", "bbb");
    }
}
