package com.javase.javaweb.util;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Hours;
import org.joda.time.MutableDateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.Date;
import java.util.Locale;

/**
 * Created by DD240 on 2017/1/6.
 */
public class JodaTimeUtil {
    public static void main(String[] args) {
        listFridays();
        getFutureDate();
        DateTime2Date();
        getDateZone();
    }

    public static void println(Object object) {
        System.out.println(object);
    }

    public static void getFutureDate() {
        //
        DateTime dt = new DateTime();
        println(dt.plusHours(100).getDayOfWeek()); // plus 100 hours 是星期几？
        println(dt.plusDays(100).toLocalDate()); // 100天后是星期几？
        println(dt.minusYears(10).dayOfWeek().getAsText()); // 10 年前的今天是星期几
        System.out.println(Hours.hoursBetween(dt, new DateTime("2012-12-21")).getHours());;
    }

    public static void formatDate() {
        //
        DateTime dt = new DateTime(); //
        println(dt);
        String localeEn = dt.dayOfWeek().getAsText(Locale.ENGLISH); //
        println(localeEn);
        dt.toLocalDate();
        //
        println(dt.toLocalDate());
        println(dt.toString(DateTimeFormat.forPattern("yyyy年M月d日")));
    }

    public static void DateTime2Date() {
        DateTime dt = new DateTime();
        println(dt);
        Date jdkDate = dt.toDate();
        println(jdkDate);
        dt = new DateTime(jdkDate);
        println(dt);
    }

    public static void getDateZone() {
        //
        DateTime dt = new DateTime();
        println(dt.withZone(DateTimeZone.forID("Europe/London"))); //
        println(dt.withZone(DateTimeZone.UTC));
    }

    public static void listFridays() {
        //
        DateTime dt = new DateTime();
        MutableDateTime mdt = new MutableDateTime();
        //
        DateTime destDateTime = dt.plusYears(10);
        while(mdt.isBefore(destDateTime)) {
            //
            mdt.addDays(1);
            //
            if (mdt.getDayOfMonth() == 13 && mdt.getDayOfWeek() == 5) {
                System.out.println(" 黑色星期五： " + mdt);
            }
        }
    }
}
