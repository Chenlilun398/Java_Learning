package com.java.hashtest;

import java.util.*;

public class HashMapTest {
    public static HashMap<String,Integer> strCount(String[] strs){
        HashMap<String, Integer> hashcount = new HashMap<String,Integer>();
        for(String str : strs){
            int val = hashcount.containsKey(str) ? hashcount.get(str):0;
            hashcount.put(str,val+1);
        }
        return hashcount;
    }

    public static void printMap(HashMap<String , Integer> hashcount) {
        Set<Map.Entry<String,Integer>> entries= hashcount.entrySet();
        for(Map.Entry<String,Integer> entry:entries){
            System.out.println(entry.getKey()+entry.getValue());
        }
    }

    public HashMapTest() {
    }



}

