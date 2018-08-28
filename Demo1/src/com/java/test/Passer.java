package com.java.test;

/**
 * Created by viruser on 2018/8/27.
 */
public class Passer {
    void toUpperCase(String[] text){
        for(int i = 0; i<text.length; i++){
            text[i] = text[i].toUpperCase();
        }
    }

    public static void main(String[] arguments){
        Passer passer = new Passer();
        passer.toUpperCase(arguments);
        for(int i = 0; i<arguments.length; i++){
            System.out.print(arguments[i] + "");
        }
        System.out.println();
    }
}
