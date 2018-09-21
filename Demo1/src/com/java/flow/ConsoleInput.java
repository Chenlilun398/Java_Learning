package com.java.flow;

import java.io.BufferedInputStream;
import java.io.IOException;

/**
 * Created by viruser on 2018/9/2.
 */
public class ConsoleInput {
    public static String readLine(){
        StringBuilder response = new StringBuilder();
        try(BufferedInputStream buff = new BufferedInputStream(System.in)) {
            int in ;
            char inChar;
            do {
                in = buff.read();
                inChar = (char) in;
                if ((in != -1) & (in != '\r') & (in != '\n')) {
                    response.append(inChar);
                }
            } while ( (in != -1) & (in != '\r') & (in != '\n') );
            buff.close();
            return response.toString();
        } catch (IOException ie) {
            System.out.println( "Error :" + ie.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("Input your name :");
        String input = ConsoleInput.readLine();
        System.out.println("Hello :" + input);
    }
}
