package com.javase;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by DD240 on 2016/11/14.
 */
public class ReflectTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = ReflectTest.class.getMethod("test", String.class, int.class);
        String result = (String)method.invoke(null, "abc", 23);
        System.out.println(result);
    }

    public static String test(String a, int b) {
        return a + b;
    }
}
