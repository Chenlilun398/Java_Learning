package com.java.flow;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by viruser on 2018/9/1.
 */
public class ByteWriter {
    public static void main(String[] args){
        int[] date = {112,25,55,25,33,58,44,54};
        try(FileOutputStream  file = new FileOutputStream("C:\\Users\\viruser.v-desktop\\Desktop\\test.txt",true)){
            int i = 0;
            while(i < date.length){
                file.write(date[i]);
                i++;
            }
            file.close();
        }catch (IOException ie){
            System.out.println(ie.getMessage());
        }
    }
}
