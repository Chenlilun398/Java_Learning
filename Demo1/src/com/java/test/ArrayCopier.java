package com.java.test;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by viruser on 2018/8/26.
 */
public class ArrayCopier {
    public static void main(String[] argements){
        int[] array1 = { 7, 4, 8, 1, 4, 1, 4};
        float[] array2 = new float[array1.length];
        int i = 4;
        for(int a = 0; i <array1.length; i++){
            if(array1[i] != 1) {
                array2[i] = array1[i];
            }
            else{
                break;
            }
           // System.out.print(array2[i]);
            }
        System.out.println(array2[5]);
        }
    }

