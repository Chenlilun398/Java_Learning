package com.java.test;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 * Created by viruser on 2018/9/23.
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date(1537698870330L);
        DateFormat df1 = DateFormat.getDateInstance();
        DateFormat df2 = DateFormat.getDateTimeInstance();




        String str = "2018-10-01 15:55:57.123";
        Date date2 = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss.SSS");
        try{
             date2 = simpleDateFormat.parse(str);
             str = simpleDateFormat2.format(date2);
        }catch (ParseException pe){
            pe.getMessage();
        }
        System.out.println(str);

    }
}
