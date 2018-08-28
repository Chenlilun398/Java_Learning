package com.java.test;

import java.awt.Point;
/**
 * Created by viruser on 2018/8/24.
 */
public class RefTester {

    public static void main(String[] arguments){
        Point pt1,pt2;
        pt1 = new Point(100,100);
        pt2 = new Point(100,100);

       // System.out.println("point1:" + pt2.x + "," + pt2.y);
        pt2 = pt1;

        pt1.x = 200;
        pt1.y = 200;


        //System.out.println("point1:" + pt1.x + "," + pt1.y);
        System.out.println("point2:" + pt2.x + "," + pt2.y);
    }
}
