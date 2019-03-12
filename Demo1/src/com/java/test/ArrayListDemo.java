package com.java.test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by viruser on 2018/9/24.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
       Stack<String> stringStack = new Stack<>();
       stringStack.push("dddd");
       stringStack.push("dfadfa");
        stringStack.push("fadfdsfsdf");
        stringStack.pop();
       while (!stringStack.isEmpty()){
           System.out.println(stringStack.pop());
       }
    }
}

class Stack<T>{
    private LinkedList<T> linkedList = new LinkedList<T>();

    public T pop(){
        return linkedList.removeFirst();
    }
    public void push(T obj) {
        linkedList.addFirst(obj);
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

}