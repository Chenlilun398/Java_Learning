package com.java.reflect;

import java.lang.reflect.Array;

/**
 * Created by viruser on 2018/11/24.
 */
public class ReflectionArray {
    public static void main(String[] args) throws Exception {
        Class<?> classType =Class.forName("java.lang.String");
        Object array = Array.newInstance(classType,5);
    }

}
