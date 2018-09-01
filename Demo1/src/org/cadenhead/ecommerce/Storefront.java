package org.cadenhead.ecommerce;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by viruser on 2018/8/30.
 */
public class Storefront {
    private LinkedList catalog = new LinkedList();

    public void addItem(String id, String name, String price, String quant, boolean nodiscount){
        Item it = new Item(id, name, price, quant, nodiscount);
        catalog.add(it);
    }

    public Item getItem(int i){
        return (Item) catalog.get(i);
    }

    public int getSize(){
        return catalog.size();
    }

    public void sort(){
        Collections.sort(catalog);
    }
}
