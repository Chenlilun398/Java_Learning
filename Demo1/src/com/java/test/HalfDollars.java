package com.java.test;

/**
 * Created by viruser on 2018/8/26.
 */
public class HalfDollars {
    public static void main(String[] arguments){
        int[] denver = {1_700_000,4_600_200,2_100_000};
        int[] philadelphia = new int[denver.length];
        int[] total = new int[denver.length];
        int average;

        philadelphia[0] = 1_800_000;
        philadelphia[1] = 5_000_000;
        philadelphia[2] = 2_500_000;

        total[0] = denver[0] + philadelphia[0];
        total[1] = denver[1] + philadelphia[1];
        total[2] = denver[2] + philadelphia[2];
        average = (total[0] + total[1] + total[2]) / 3;

        System.out.print("2012 production:");
        System.out.format("%,d%n",total[0]);
        //System.out.println(denver.length);
    }
}
