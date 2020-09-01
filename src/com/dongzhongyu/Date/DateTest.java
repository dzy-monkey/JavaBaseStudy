package com.dongzhongyu.Date;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //当前时间
        Date now = new Date();
        System.out.println(now);
        //Date类的设计有缺陷，所以改用calendar类
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));


    }
}
