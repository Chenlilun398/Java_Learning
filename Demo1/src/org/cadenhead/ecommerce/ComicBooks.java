package org.cadenhead.ecommerce;

import java.util.*;
/**
 * Created by viruser on 2018/8/31.
 */
public class ComicBooks {
    public ComicBooks() {
    }

    public Condition curcond;

    public void setCondition(Condition cond){
        curcond = cond;
    }

    public static void main(String[] args){

        ComicBooks comicBooks = new ComicBooks();
        HashMap quantity = new HashMap();
        float price1 = 3.00F;
        quantity.put("mint",price1);
        float price2 = 2.00F;
        quantity.put("near mint",price2);
        float price3 = 1.50F;
        quantity.put("very fine",price3);
        float price4 = 1.00F;
        quantity.put("fine",price4);
        float price5 = 0.5F;
        quantity.put("good",price5);
        float price6 = 0.25F;
        quantity.put("poor",price6);

        Comic[] comix = new Comic[3];
        comicBooks.setCondition(Condition.MINT);
        //comix[0] = new Comic("Amazing","1A",comicBooks.curcond, 12_000.00F);
        //comix[0].setPrice( (Float) quantity.get(comix[0].condition) );
        comix[1] = new Comic("Incredible","181", "near mint", 680.00F);
        comix[1].setPrice( (Float) quantity.get(comix[1].condition) );
        comix[2] = new Comic("Cerebus","1A", "good", 190.00F);
        comix[2].setPrice( (Float) quantity.get(comix[2].condition) );
        for (int i = 0; i < comix.length; i++){
            System.out.println("Title: " + comix[i].title);
            System.out.println("Issue: " + comix[i].issueNumber);
            System.out.println("Condition: " + comix[i].condition);
            System.out.println("Price: $" + comix[i].price + "\n");
        }
    }
}

