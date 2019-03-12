package com.java.flow;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by viruser on 2018/10/11.
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,String> tmap = new TreeMap<String,String>();
        tmap.put("jack","zhangsan");
        tmap.put("mary","xiaohong");
        tmap.put("rose","xiaozhang");
        tmap.put("iose","xiaoming");
        System.out.println(tmap);

        Set<Map.Entry<String,String>> entries = tmap.entrySet();
        for(Map.Entry<String,String> entry : entries ){
            System.out.println(entry.getKey() + "----" + entry.getValue());
        }
    }
}
