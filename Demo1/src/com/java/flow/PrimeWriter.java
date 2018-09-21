package com.java.flow;

import java.io.*;

/**
 * Created by viruser on 2018/9/2.
 */
public class PrimeWriter {
    public static void main(String[] args) {
        int[] primes = new int[20];
        int check = 2;
        for (int i = 0; i < primes.length; ) {
            if (isPrime(check)) {
                primes[i] = check;
                i++;
            }
            check++;
        }

        try (FileOutputStream file = new
                FileOutputStream("C:\\Users\\viruser.v-desktop\\Desktop\\t2.dat");
             BufferedOutputStream buff = new
                     BufferedOutputStream(file);
             DataOutputStream data =
                     new DataOutputStream(buff);
        ) {
            for (int i = 0; i < primes.length ;i++) {
                data.writeInt(primes[i]);
                System.out.print(primes[i]);
            }
            data.close();
        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }
    }

    public static boolean isPrime(int check) {
        double root = Math.sqrt(check);
        for (int i = 2; i <= root; i++ ) {
            if(check % i == 0)
                return false;
            }
            return true;
        }
}
