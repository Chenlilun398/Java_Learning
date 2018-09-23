package com.java.test;

import static java.lang.Thread.sleep;

/**
 * Created by viruser on 2018/9/23.
 */
public class EnumDemo {
    public static void main(String[] args) {
        Persion[] persions = Persion.values();
        for(Persion p:persions) {
            switch (p) {
                case P1:
                    System.out.println("p1");
                    try{sleep(10000);}catch (Exception e){}
                    break;
                case P2:
                    System.out.println("p2");
                    break;
                case P3:
                    System.out.println("p3");
                    break;
                default:
                    System.out.println("not fund");
            }
        }

    }
}

enum Persion{
    P1("zhangsan",20),P2("lisi",30),P3("wangwu",40);
    private String name;
    private int age;
    private Persion(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + "--" + age;
    }
}
