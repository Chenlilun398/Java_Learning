package com.java.flow;

import java.io.*;

/**
 * Created by viruser on 2018/9/2.
 */
public class PrimeReader {
    public static void main(String[] args) {
        try (FileInputStream file = new
                FileInputStream("C:\\Users\\viruser.v-desktop\\Desktop\\t2.dat");
        BufferedInputStream buff = new
                BufferedInputStream(file);
        DataInputStream data = new DataInputStream(buff);) {
            try {
                while(true){
                    System.out.println(data.readInt());
                }
            } catch (EOFException eof) {
                //System.out.println("Error :" + eof.getMessage());
                file.close();
                buff.close();
                data.close();
            }
            finally {
                data.close();
            }
        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
