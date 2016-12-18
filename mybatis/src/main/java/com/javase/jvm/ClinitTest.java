package com.javase.jvm;

/**
 * Created by root on 12/18/16.
 */
public class ClinitTest {
    static {
        i = 0; // 给变量赋值可以正常编译通过
        // System.out.print(i); // 这句编译器会提示"非法向前引用"
    }
    static int i = 1;

    static class Parent {
        public static int A = 1;

        static {
            A = 2;
        }

    }

    static class Sub extends Parent {
        public static int B = A;
    }

    public static void main(String[] args) {
        System.out.println(Sub.B);
    }
}


