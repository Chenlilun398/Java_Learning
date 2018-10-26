package com.java.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by viruser on 2018/10/17.
 */
public class PrettyGirl implements IGirl {
    private List<IBoyFriend> boyFriendList = new ArrayList<IBoyFriend>();
    private String msg ="I'm sick";

    @Override
    public void attachBoyFriend(IBoyFriend boyFriend) {
        boyFriendList.add(boyFriend);
    }

    @Override
    public void detachBoyFriend(IBoyFriend boyFriend) {
        if(boyFriendList.size()>0){
            boyFriendList.remove(boyFriend);
        }
    }

    @Override
    public void notifyAllBoyFriends() {
        for(IBoyFriend boyFriend : boyFriendList){
            boyFriend.update(msg);
        }
    }
}
