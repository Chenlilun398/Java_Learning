package com.java.test;

/**
 * Created by viruser on 2018/9/16.
 */
public class Person {
    public String name;
    public Person(String name) {
        this.name = name;
    }
    public void work() {
        System.out.println("working");
    }
}

class Studend extends Person{
    int age;
    public Studend(String name,int age) {
        super(name);
        this.age = age;
    }
    public void work() {
        System.out.println("learning");
    }
}

class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }
    public void work() {
        System.out.println("teaching");
    }
}
