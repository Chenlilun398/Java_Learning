package com.java.test;

/**
 * Created by viruser on 2018/8/28.
 */
public class Box {
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;

    Box bulidBox(int a, int b, int c, int d){
        a = 6;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        return this;
    }
}
