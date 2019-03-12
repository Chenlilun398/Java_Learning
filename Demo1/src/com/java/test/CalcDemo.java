package com.java.test;

import java.util.Scanner;

public class CalcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a：");
        int a = scanner.nextInt();
        System.out.println("请输入b：");
        int b = scanner.nextInt();
        System.out.print("a*b:");
        System.out.println(a*b);
    }
}
