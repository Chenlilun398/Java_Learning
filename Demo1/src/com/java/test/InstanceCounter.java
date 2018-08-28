package com.java.test;

/**
 * Created by viruser on 2018/8/28.
 */
public class InstanceCounter {
    private static int numInstance = 0;

    protected static int getCount(){
        return numInstance;
    }

    private static void addInstance(){
        numInstance++;
    }

    InstanceCounter(){
        InstanceCounter.addInstance();
}


}
