package com.java.test;

import javafx.scene.AmbientLight;

/**
 * Created by viruser on 2018/9/24.
 */
public class GenericDemo1 {
    public static void main(String[] args) {
        Generic generic = new Generic();
        generic.print(new Cat());
        Generic.printstatic("dddd");
    }
}

class Generic{
    public <T extends Animal> void print(T animal){
        System.out.println("animal");
        animal.eat();
    }
    public <T extends Dog> void print(T dog){
        System.out.println("dog");
        dog.eat();
    }
    public <T extends Cat> void print(T cat){
        System.out.println("cat");
        cat.eat();
    }
    public static <T> void printstatic(T obj){
        System.out.println(obj);
    }
}
abstract class Animal{
    public abstract void eat();
}
class Dog extends Animal{
    public void eat(){
        System.out.println("dog eating");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("cat eating");
    }
}