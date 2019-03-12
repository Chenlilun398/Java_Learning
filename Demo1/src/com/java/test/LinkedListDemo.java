package com.java.test;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by viruser on 2018/9/26.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("dfad");
        linkedList.add("dfa");
        linkedList.add("dfafaxxx");
        linkedList.addFirst("chenn");
        linkedList.addLast("XXXXXX");

        Iterator<String> it = linkedList.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(String str : linkedList){
            System.out.println(str);
        }
    }
}
