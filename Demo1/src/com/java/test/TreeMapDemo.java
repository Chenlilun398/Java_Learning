package com.java.test;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Person,String> tmap = new TreeMap<Person,String>() ;
        tmap.put(new Person("zhangsan",20),"zs");
        tmap.put(new Person("fi",22),"ls");
        tmap.put(new Person("roser",30),"rs");
        tmap.put(new Person("zhangsanu",24),"zs2");
        System.out.println(tmap);
    }
}

class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o){
        o.hashCode();

        if(this.name.length()>o.getName().length())
            return 1;
        else return -1;



    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
