package com.java.test;

/**
 * Created by viruser on 2018/9/15.
 */
public class Sort {
    public static void main(String[] args) {
     Testtt t = new Testtt(2,1);
        //System.out.println(t.getA());
    }
}

class Testtt{
    private int a;
    public Testtt(){
        System.out.println("ddddd");
    }
    public  Testtt(int a){
        this();
        System.out.println("ddssefasef");
        this.a = a;
    };
    public Testtt(int a,int b){
        this(1);
    }

    public int getA(){
        return a;
    }
}