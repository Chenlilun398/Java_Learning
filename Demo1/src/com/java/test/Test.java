package com.java.test;
/**
 * Created by viruser on 2018/8/21.
 */
public class Test {
    public static void main(String[] args){
        System.out.println("starting with " +
                InstanceCounter.getCount() + " object(s)");
        for(int i = 0; i<10; ++i){
            new InstanceCounter();
            System.out.println(InstanceCounter.getCount());
        }
        System.out.println("created " + InstanceCounter.getCount() + " object(s)");
    }
}
