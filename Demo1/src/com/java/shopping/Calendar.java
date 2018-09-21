package com.java.shopping;

import java.text.*;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by viruser on 2018/9/13.
 */
public class Calendar {
        public static void main(String[] args) throws ParseException{
            Calendar calendar = new Calendar();
        }

    public boolean isRn(int year) {
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return true;
        else
            return false;
    }

    public int daysOfMonth(int year, int month) {
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        else if(month == 4 || month == 6 || month ==9 || month == 11)
            return 30;
        else if (isRn(year) && month == 2)
            return 29;
        else return 28;
    }

    public int weekday(int year, int month) throws ParseException{
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String s1 = year + "-" + month + "-01";
        String s2 = "1900-01-01";
        Date d1 = df.parse(s1);
        Date d2 = df.parse(s2);
        return (int) ((d1.getTime()-d2.getTime())/(60*60*1000*24))%7 + 1;
    }

    public Calendar() throws ParseException{
        Scanner input = new Scanner(System.in);
        System.out.print("please input year: ");
        int year = input.nextInt();
        System.out.print("please input month: ");
        int month = input.nextInt();
        System.out.println("********************************\n\t\t" + year + "年" + month + "月份\n");
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for(int j = 0; j < weekday(year,month) && weekday(year,month) != 7; j++) {
            System.out.print("\t");
        }
        for(int i = 1; i <= daysOfMonth(year,month); i++){
            if(i<10)
                System.out.print(" " + i +"\t");
            else System.out.print(i +"\t");
            if((weekday(year,month) + i)%7 == 0)
                System.out.println();
        }
    }
}
