package com.java.test;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 * Created by viruser on 2018/9/23.
 */
public class DataDemo {
    public static void main(String[] args) {
        Date date = new Date(1537698870330L);
        DateFormat df1 = DateFormat.getDateInstance();
        DateFormat df2 = DateFormat.getDateTimeInstance();


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        try{Date d = simpleDateFormat.parse("2018-05-15");
            System.out.println(d);}catch (Exception e){"error"e.getMessage();}
    }
}
