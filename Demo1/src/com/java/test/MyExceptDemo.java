package com.java.test;

import java.util.Random;

/**
 * Created by viruser on 2018/9/24.
 */
public class MyExceptDemo {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Doctor doctor = new Doctor();
        try{
            worker.work();
        }catch (SickException se){
            System.out.println(se.getMessage());
            doctor.cure(worker);
            if (worker.getStatus().equals("dead")) {
                System.out.println("sile!!!");
            }else{
                System.out.println("haole!!!");
            }
            }finally {
            System.out.println("welcome next time");
        }
    }
}

class Worker {
    private String status;
    public void work()throws SickException{
        Random random = new Random();
        if(random.nextInt(100)<50){
            throw new SickException("生病了！");
        } else{
            System.out.println("working");
        }
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}
class Doctor{
    public void cure(Worker worker){
            Random random = new Random();
            int num = random.nextInt(100);
            if (num > 30){
                worker.setStatus("health");
            }else{
               worker.setStatus("dead");
            }
        }
}
class SickException extends Exception{
    private String message;
    public SickException(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
