package com.java.test;


import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by viruser on 2018/8/21.
 */
public class Test{
    public static void main(String[] args) {
        HashMap look = new HashMap();
        Rectangle r1 = new Rectangle(0, 0, 5, 5);
        Rectangle r2 = new Rectangle(0, 0, 10, 10 );
        Rectangle r3 = new Rectangle(0, 0, 15, 15 );
        look.put("a",r1);
        look.put("b",r2);
        look.put("c",r3);

        Rectangle r = (Rectangle) look.get("b");
        System.out.println(r.x);
    }
}
