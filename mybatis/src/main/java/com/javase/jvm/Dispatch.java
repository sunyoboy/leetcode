package com.javase.jvm;

/**
 * Created by root on 12/19/16.
 */
public class Dispatch {
    static class QQ {}
    static class _360{}

    public static class Father {
        public void hardChoice(QQ qq) {
            System.out.println("father choose qq");
        }

        public void hardChoice(_360 arg) {
            System.out.println("father choose 360");
        }
    }

    public static class Son extends Father {
        public void hardChoice(QQ qq) {
            System.out.println("son choose qq");
        }

        public void hardChoice(_360 arg) {
            System.out.println("son choose 360");
        }
    }

    public static void main(String[] args) {
        Father father = new Father();
        Father son = new Father();
        father.hardChoice(new _360()); // father choose 360
        son.hardChoice(new QQ()); // son choose qq
    }
}
