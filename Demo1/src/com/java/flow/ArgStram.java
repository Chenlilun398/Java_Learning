package com.java.flow;

import java.io.*;

/**
 * Created by viruser on 2018/9/1.
 */
public class ArgStram {
    int start = 0;
    int finish = 255;

    ArgStram(int st, int fin) {
        start = st;
        finish = fin;
    }

    boolean writeStream() {
        try(FileOutputStream file = new
                FileOutputStream("C:\\Users\\viruser.v-desktop\\Desktop\\t1.txt");
            BufferedOutputStream buff = new
                    BufferedOutputStream(file)) {

            for(int out = start; out <= finish; out++) {
                buff.write(out);
                System.out.println(" " + out);
            }
            buff.close();
            return true;
        }catch (IOException ie) {
            ie.getMessage();
            return false;
        }
    }

    boolean readStream() {
        try (FileInputStream file = new
                FileInputStream("C:\\Users\\viruser.v-desktop\\Desktop\\test.txt");
        BufferedInputStream buff = new BufferedInputStream(file)) {
            int in ;
            do {
                in = buff.read();
                if (in != -1){
                    System.out.println(" " + in);
                }
            }while (in != -1);
            System.out.println();
            buff.close();
            return true;
        }catch (IOException ie) {
            ie.getMessage();
            return false;
        }
    }
}
