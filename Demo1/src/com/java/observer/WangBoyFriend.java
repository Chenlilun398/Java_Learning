package com.java.observer;

/**
 * Created by viruser on 2018/10/17.
 */
public class WangBoyFriend implements IBoyFriend {
    @Override
    public void update(String msg) {
        if(msg.equals("I'm sick")){
            System.out.println("I don't care");
        }
    }
}
