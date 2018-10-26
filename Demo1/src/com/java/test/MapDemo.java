package com.java.test;

import java.util.*;

/**
 * Created by viruser on 2018/9/27.
 */
public class MapDemo {
    public static void main(String[] args) {

        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("afa","fadf");
        hashMap.put("bfdf","favzdf");
        hashMap.put("cdfas","favvzvdf");
        hashMap.put("ddfa","fvzvvcvavdf");
        hashMap.put("evv","fadvzcvzvzfadf");

        System.out.println(hashMap.size());
        Set<String> keys = hashMap.keySet();
        Set<Map.Entry<String,String>> set=hashMap.entrySet();

        for(Map.Entry<String,String> entry : set){
            System.out.println(entry.getKey()+"---"+ entry.getValue());
        }


        Integer a = Integer.valueOf("1");
        Integer b = Integer.valueOf(1);
        System.out.println(a==b);

    }
}
