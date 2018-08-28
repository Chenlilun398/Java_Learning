package com.java.test;

import java.awt.Point;
/**
 * Created by viruser on 2018/8/28.
 */
public class FourDPoint extends Point {
     int z;
     int t;

    public FourDPoint(int x, int y, int z, int t){
        super(x,y);
        this.z = z;
        this.t = t;
    }

    public static void main(String[] args){
        FourDPoint fdpoint = new FourDPoint(1,2,3,4);
        System.out.println(fdpoint.x+"");
    }
}
