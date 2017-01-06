package com.javase.jvm;

/**
 * Created by root on 12/18/16.
 */
public class DeadLoopClass {
/*

    static {
        //
        if(true) {
            System.out.println(Thread.currentThread() + "init DeadLoopClass");
            while (true) {

            }
        }
    }
*/

    public static void main(String[] args) {
        Runnable script = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + "start");
                DeadLoopClass dlc = new DeadLoopClass();
                System.out.println(Thread.currentThread() + "over");
            }
        };

        Thread thread1 = new Thread(script);
        Thread thread2 = new Thread(script);
        // thread1.start();
        // thread2.start();
        DeadLoopClass t = new DeadLoopClass();
        DeadLoopClass s = t;
        Class c = t.getClass();
        Class a = Object.class;
        System.out.println(c.isAssignableFrom(DeadLoopClass.class));
        System.out.println(c.isInstance(t));
        System.out.println(t.equals(s));
        System.out.println((t instanceof DeadLoopClass));
    }
}
