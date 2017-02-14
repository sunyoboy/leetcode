package com.javase.jvm.thread;

import com.javase.jvm.User;

/**
 * Created by root on 12/22/16.
 */
public class ReadThread implements Runnable {

    private User user;

    public ReadThread(User user) {
        this.user = user;
    }
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p/>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ReadThread value: " + user.getValue());
    }
}
