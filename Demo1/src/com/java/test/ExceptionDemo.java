package com.java.test;

/**
 * Created by viruser on 2018/9/24.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        Bar bar = new Bar();
        try{
            bar.enter(30);
        }catch (AgeLessThanException e){
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }
}

class AgeLessThanException extends Exception{
    private String message;
    public AgeLessThanException(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}

class Bar{
    public void enter(int age)throws AgeLessThanException{
        if(age < 18){
            throw new AgeLessThanException("年龄太小");
        }else{
            System.out.println("welcome!!");
        }
    }
}