package com.java.observer;

/**
 * Created by viruser on 2018/10/17.
 */
public class TestObserverDemo {
    public static void main(String[] args) {
        ZhangBoyFriend zhangBoyFriend = new ZhangBoyFriend();
        LiBoyFriend liBoyFriend = new LiBoyFriend();
        WangBoyFriend wangBoyFriend = new WangBoyFriend();

        PrettyGirl prettyGirl = new PrettyGirl();
        prettyGirl.attachBoyFriend(zhangBoyFriend);
        prettyGirl.attachBoyFriend(liBoyFriend);
        prettyGirl.attachBoyFriend(wangBoyFriend);
        prettyGirl.detachBoyFriend(wangBoyFriend);

        prettyGirl.notifyAllBoyFriends();
    }
}
