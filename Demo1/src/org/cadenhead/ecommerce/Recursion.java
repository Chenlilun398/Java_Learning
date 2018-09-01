package org.cadenhead.ecommerce;

/**
 * Created by viruser on 2018/8/31.
 */
public class Recursion {
    public int dex = -1;

    public int Recursion1(int i){
        dex = getValue(17);
        return  dex;
    }
    public int getValue(int dexValue){
        if(dexValue > 100){
            return dexValue;
        }
        else{
            return getValue(dexValue * 2);
        }
    }

    public static void main(String[] args){
        Recursion r = new Recursion();
        System.out.println(r.dex);
    }
}
