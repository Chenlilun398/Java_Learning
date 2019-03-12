package com.java.shopping;

import java.util.*;

/**
 * Created by viruser on 2018/9/13.
 */
public class Shopping2 {
    public static void main(String[] args) {
        HashMap number = new HashMap();
        Goods goods1 = new Goods(1,"book",5.00,true);
        number.put(1,goods1);
        Goods goods2 = new Goods(2,"pen",6.00,true);
        number.put(2,goods2);
        Goods goods3 = new Goods(3,"notebook",7.00,true);
        number.put(3,goods3);

        double allPrice = 0;
        String str ="";
        int no;
        int num;
        boolean flg = true;
        while(flg) {
            try {
                System.out.print("请输入商品编号:");
                Scanner input = new Scanner(System.in);
                no = input.nextInt();
                System.out.print("请输入商品数量:");
                num = input.nextInt();
                Goods goods = (Goods) number.get(no);
                str = str + "\n编号:" + no + ", 名称:" + goods.name + ", 单价:" + goods.price + ", 数量:" +
                        num + ", 合计:" + goods.price * num;
                allPrice += goods.price * num;
            System.out.print("是否继续购买y/n？");
            if(input.next().equals("y")) {
                flg = true;
            }
            else flg = false;
            }catch (NullPointerException | InputMismatchException npe) {
                System.out.println("输入信息错误");
            }
        }
        System.out.println(str);
        System.out.println("总计:" + allPrice);
    }
}
