package com.java.hashtest;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> pList = new ArrayList<Person>();
        pList.add(new Person("zhangsan",20,"aaaa"));
        pList.add(new Person("lisi",20,"bbbb"));
        pList.add(new Person("wangwu",15,"cccc"));
        pList.add(new Person("wangwu",15,"dddd"));
        pList.add(new Person("wangwu",16,"eeee"));
        pList.add(new Person("wangwu",15,"ffff"));
        SortList.sortList(pList);
        SortList.PrintList(pList);
        //System.out.println(pList);

    }
}
