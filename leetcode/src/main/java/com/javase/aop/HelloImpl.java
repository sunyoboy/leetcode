package com.javase.aop;

/**
 * Created by DD240 on 2016/11/15.
 */
public class HelloImpl implements HelloInterface, HelloInterface2 {
    private volatile String infos1;

    private volatile String infos2;

    public String getInfos1() {
        return infos1;
    }

    public String getInfos2() {
        return infos2;
    }

    public void setInfo(String infos1, String infos2) {
        this.infos1 = infos1;
        this.infos2 = infos2;
        this.display();
    }

    public void display() {
        System.out.println("\t\t" + infos1 + "\t" + infos2);
    }

    public void test() {

    }
}
