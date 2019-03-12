package com.java.test;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by viruser on 2018/8/21.
 */
public class Test{
    public static void main(String[] args) {
        System.out.println(Student.name);
        Student student1 = new Student("zhangsan",20);
        System.out.println("student1:" + student1.getName() + student1.getAge());
        Student student2 = new Student("lisi",25);
        System.out.println("student2:" + student2.getName() + student2.getAge());
        System.out.println("student1:" + student1.getName() + student1.getAge());
    }
}

