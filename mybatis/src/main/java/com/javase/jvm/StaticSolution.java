package com.javase.jvm;

/**
 * Created by root on 12/19/16.
 */
public class StaticSolution {
    public static void sayHello() {
        System.out.println("hello world!");
    }


    public static void main(String[] args) {
        StaticSolution.sayHello();
        StaticSolution solution = new StaticSolution();
        solution.sayYes();
    }

    public final void sayYes() {
        System.out.println("Yes!");
    }
}
