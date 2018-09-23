package com.java.test;

import java.util.Arrays;

/**
 * Created by viruser on 2018/9/23.
 */
public class Container {
    public static void main(String[] args) {
        Contain contain = new Contain();
        contain.put("jack","陈豪");
        contain.put("jav","周杰伦");
        contain.put("rose","小红");
        contain.put(10,"john","小明");
        contain.put(2,"jack","陈豪");

       System.out.println(contain.get().length);
        Contain.Entry[] entry = contain.get();

        for(int i = 0; i<entry.length; i++){
            try {
                System.out.println("count: " + i + ", key: " + entry[i].getKey() + ", value: " + entry[i].getValue());
            }catch (NullPointerException npe){
                //System.out.println(npe.getMessage());
            }
        }
    }
}


class Contain {
    private Entry[] entries = new Entry[2];
    private int count = 0;

    public void put(String key,String value) {
        Entry entry = new Entry();
        entry.setKey(key);
        entry.setValue(value);
        entries[count++] = entry;
        if (count >= entries.length){
            entries = Arrays.copyOf(entries, entries.length *2);
        }
    }

    public void put(int count, String key, String value){
        Entry entry = new Entry();
        entry.setKey(key);
        entry.setValue(value);
        while (count >= this.entries.length){
            entries = Arrays.copyOf(entries, entries.length *2);
        }
        entries[count] = entry;
        this.count = ++count;
    }

    public Entry[] get(){
        //System.out.println(entries.length);
        return  Arrays.copyOfRange(entries, 0,count);
    }


    class Entry{
        private String key = null;
        private String value = null;
        public void setKey(String key){
            this.key = key;
        }
        public void setValue(String value){
            this.value = value;
        }
        public String getKey(){
            return key;
        }
        public String getValue(){
            return value;
        }
    }
}
