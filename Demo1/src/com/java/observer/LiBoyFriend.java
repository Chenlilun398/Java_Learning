package com.java.observer;

/**
 * Created by viruser on 2018/10/17.
 */
public class LiBoyFriend implements IBoyFriend{
    @Override
    public void update(String msg) {
        if(msg.equals("I'm sick")){
            System.out.println("I'm busy");
        }
    }
}
