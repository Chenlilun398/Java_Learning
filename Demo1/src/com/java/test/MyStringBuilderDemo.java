package com.java.test;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by viruser on 2018/9/23.
 */
public class MyStringBuilderDemo {
    public static void main(String[] args) {
        MyStringBuilder mstr = new MyStringBuilder("dfa055");
        mstr.append("12dddddddddddddd3");
        mstr.append(123);
        System.out.println(mstr.append("asf"));
        System.out.println("length: " + mstr.length());
        System.out.println("capacity: " + mstr.capacity());
        System.out.println("to string: " + mstr.toString());
    }
}

class MyStringBuilder {
    private char[] value;
    private int count = 0;
    public MyStringBuilder(){
        value = new char[16];
    }
    public MyStringBuilder(int capacity){
        value = new char[capacity];
    }
    public MyStringBuilder(String str){
        value = new char[str.length()+16];
        str.getChars(0,str.length(),value,count);
        count += str.length();
    }
    public int length(){
        return count;
    }
    public int capacity(){
        return value.length;
    }
    public MyStringBuilder append(Object obj){
        String string = "" + obj;
        int len = string.length();
        System.out.println("value.length: " + value.length);
        if(value.length < count + len){
            value = Arrays.copyOf(value,value.length * 2);
        }
        string.getChars(0,len,value,count);
        count += len;
        return this;
    }

    public String toString(){
        return new String(value,0,count);
    }


}
