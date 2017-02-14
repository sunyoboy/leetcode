package com.javase.jvm;

/**
 * Created by root on 12/22/16.
 */
public class StringTest {
    public static void main(String[] args) {
        String a = "a" + "b" + 1;
        String b = "ab1";
        System.out.println(a == b);
    }
}
