package com.javase.jvm;

/**
 * Created by root on 12/22/16.
 */
public class User {

    private int value;

    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }
}
