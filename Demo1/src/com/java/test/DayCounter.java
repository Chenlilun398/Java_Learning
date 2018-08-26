package com.java.test;

/**
 * Created by viruser on 2018/8/26.
 */
public class DayCounter {
    public static void main(String[] args) {
        int year = 2000;
        for (int month = 1; month <=12; month++){
            System.out.println(month + "月,共有" + Days(year,month) + "天：");
            for(int day = 1;day<=Days(year,month);day++) {
                System.out.print(month + "-" + day + ";");
            }
            System.out.println();
        }
    }

    static int Days(int year ,int month){
        int maxday = -1;
        if(month==1||month==3||month==5||month==7||month==8
                ||month==10||month==12){
            maxday=31;
        }
        else if(month==4||month==6||month==9||month==11){
            maxday=30;
        }
        else if(month==2 && Isrn(year)==1){
            maxday=29;
        }
        else {
            maxday = 28;
        }
        return maxday;
    }

    static int Isrn(int year){
        int isrn = -1;
        if((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)){
            isrn = 1;
        }
        else{
            isrn = 0;
        }
        return isrn;
    }
}

