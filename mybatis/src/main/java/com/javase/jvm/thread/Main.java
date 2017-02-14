package com.javase.jvm.thread;

import com.javase.jvm.User;

/**
 * Created by root on 12/22/16.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getValue());
        ReadThread readThread = new ReadThread(user);
        Thread r = new Thread(readThread);
        WriteThread writeThread  = new WriteThread(user);
        Thread t = new Thread(writeThread);

        ReadThread readThread1 = new ReadThread(user);
        Thread r1 = new Thread(readThread1);

        // r.start();
        r.start();
        t.start();

        r1.start();
        System.out.println(" : " + Thread.MAX_PRIORITY);
        System.out.println(" : " + Thread.MIN_PRIORITY);
        System.out.println(" : " + Thread.NORM_PRIORITY);

    }
}
