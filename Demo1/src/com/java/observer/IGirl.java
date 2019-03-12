package com.java.observer;

/**
 * Created by viruser on 2018/10/17.
 */
public interface IGirl {
    public void attachBoyFriend(IBoyFriend boyFriend);
    public void detachBoyFriend(IBoyFriend boyFriend);
    public void notifyAllBoyFriends();

}
