package com.java.hashtest;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int compareTo(Person o){
        if(this.getAge() - o.getAge() > 0)
            return 1;
        else if(this.getAge() - o.getAge() < 0)
            return -1;
        else if(this.getName().compareTo(o.getName()) > 0)
            return 1;
        else if(this.getName().compareTo(o.getName()) < 0)
            return -1;
        else return 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
