package com.java.hashtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortList {
    public static ArrayList<Person> sortList(ArrayList<Person> pList){
        Collections.sort(pList);
        return pList;
    }

    public static void PrintList(ArrayList<Person> pList){
        Iterator<Person> it = pList.iterator();
        while (it.hasNext()){
            Person p = it.next();
            System.out.println("name: " + p.getName() + ",age: " +
                p.getAge() + ",id: " + p.getId() + ".");
        }
    }
}

