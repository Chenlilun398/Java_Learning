package com.java.shopping;

import java.util.HashMap;

/**
 * Created by viruser on 2018/9/13.
 */
public class Goods {

    public int no;
    public String name;
    public double price;
    public boolean isSale;

    public Goods(int no, String name, double price, boolean isSale) {
        this.no = no;
        this.name = name;
        this.price = price;
        this.isSale = isSale;
    }
}
