package com.java.test;

/**
 * Created by viruser on 2018/9/23.
 */
public class StringDemo {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("1111");
        StringBuilder stringBuilder = new StringBuilder(20);
        System.out.println(stringBuilder.capacity());
        stringBuilder.append("dddddddddddddddddddddddddddddddddddddd");

        System.out.println(stringBuilder);


        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
        //sb.a
    }
}