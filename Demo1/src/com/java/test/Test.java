package com.java.test;

import java.io.Console;
import java.lang.String;

/**
 * Created by viruser on 2018/8/21.
 */
public final class Test {
    public static void main(String[] args) {
        Person person1 = new Studend("zhangsan",25);
        //person1.work();
        Person person2 = new Person("lisi");
        //person2.work();
            Teacher studend = (Teacher) person2;
            person2.work();
    }
}
