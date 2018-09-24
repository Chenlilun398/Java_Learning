package com.java.test;

import java.util.Arrays;

/**
 * Created by viruser on 2018/9/24.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        IArrayList<Fish> arrayList = new ArrayList<>(9);
        for(int i = 0; i<10; i++) {
            arrayList.add(new Fish(i + "fish"));
        }
        for(int i = 0; i<10; i++) {
            System.out.println(arrayList.get(i).getName());
        }
        System.out.println(arrayList.size());
    }
}

interface IArrayList<T>{
    public void add(T obj);
    T get(int index);
    int size();
}

class ArrayList<T> implements IArrayList<T>{
    private Object[] obj =null;
    private int count = 0;
    public ArrayList(){
        obj = new Object[8];
    }
    public ArrayList(int capacity){
        obj =  new Object[capacity];
    }
    public void add(T obj){
        this.obj[count++] = obj;
        ensureCapacity();
    }
    public T get(int index){
        return (T)obj[index];
    }
    public int size(){
        return obj.length;
    }
    private void ensureCapacity(){
        if(count >= obj.length){
            //System.out.println("old" + obj.length);
            obj = Arrays.copyOf(obj,obj.length<<1);
            //System.out.println("new" + obj.length);
        }
    }
}

class Fish{
    private String name ;
    public Fish(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}