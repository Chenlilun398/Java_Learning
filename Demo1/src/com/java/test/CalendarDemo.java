package com.java.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by viruser on 2018/9/24.
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        //calender.setTime();
        System.out.println(calendar.get(1));
        System.out.println(calendar.getTime());
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String dateString = sdf1.format(calendar.getTime());
        System.out.println(dateString);
    }
}
