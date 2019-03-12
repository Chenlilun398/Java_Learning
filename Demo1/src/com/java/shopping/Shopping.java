package com.java.shopping;

import java.util.HashMap;

/**
 * Created by viruser on 2018/9/13.
 */
public class Shopping {
    public static void main(String[] args) {
        HashMap number = new HashMap();
        Goods goods1 = new Goods(1,"book",5.00,true);
        number.put(1,goods1);
        Goods goods2 = new Goods(2,"pen",6.00,true);
        number.put(2,goods2);
        Goods goods3 = new Goods(3,"notebook",7.00,true);
        number.put(3,goods3);

        int[][] list = {{1,3},{2,5},{3,20}};
        double allPrice = 0;
        String str ="";
        for(int i = 0; i < list.length; i++) {
            int no = list[i][0];
            int num = list[i][1];
            Goods goods = (Goods) number.get(no);
            str = str + "编号:" + no + ", 名称:" + goods.name + ", 单价:" + goods.price + ", 数量:" +
                    num + ", 合计:" + goods.price * num + "\n";
            allPrice += goods.price * num;
        }
        System.out.println(str);
        System.out.println("总计:" + allPrice);
    }
}
