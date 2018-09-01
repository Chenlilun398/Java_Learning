package com.java.flow;

/**
 * Created by viruser on 2018/9/1.
 */
public class BufferDemo {
    public static void main(String[] args){
        int start = 0;
        int finish = 255;
        if(args.length > 1){
            start = Integer.parseInt(args[0]);
            finish = Integer.parseInt(args[1]);
        } else if (args.length > 0){
            start = Integer.parseInt(args[0]);
        }
        ArgStram as = new ArgStram(start,finish);
        System.out.println("\nWriting: ");
        boolean sucess = as.writeStream();
        System.out.println("\nReading: ");
        boolean readSucess = as.readStream();
    }
}
