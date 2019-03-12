package com.java.test;

/**
 * Created by viruser on 2018/9/22.
 */
public class StragetyDemo {
    public static void main(String[] args) {

        Tester1 tester1 = new Tester1("lisi");
        tester1.fun();
    }
}


class Tester1{
    private String name;
    public Tester1(String name) {
        this.name = name;
    }
    public void fun(){
        System.out.println("test");
    }
}