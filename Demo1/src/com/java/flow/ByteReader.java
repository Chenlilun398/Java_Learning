package com.java.flow;

import java.io.*;

/**
 * Created by viruser on 2018/9/1.
 */
public class ByteReader {
    public static void main(String[] args){
        try(
            FileInputStream file = new FileInputStream("C:\\Users\\viruser.v-desktop\\Desktop\\新建文本文档.txt");
        ){

            boolean eof = false;
            int count = 0;
            while (!eof) {
                int input = file.read();
                System.out.print(input + " ");
                if (input == -1)
                    eof = true;
                else
                    count++;
            }
            file.close();
            System.out.println("\nByte read: " + count);
        }catch (IOException e){
            System.out.println("Error -- "+ e.getMessage());
        }
    }
}
