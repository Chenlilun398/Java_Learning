package com.java.test;

import java.util.Random;

/**
 * Created by viruser on 2018/9/24.
 */
public class RandomGenDemo {
    public static void main(String[] args) {
        RandomGen randomGen = new RandomGen();
        for(int i = 0; i<10; i++){
          System.out.println(randomGen.getRandomCode());
        }
    }
}

class RandomGen{
    char[] code = new char[4];
    public String getRandomCode(){
        String str = null;
        Random random = new Random();
        for(int i = 0; i < code.length; ){
            int rand = random.nextInt(91);
            if( (rand >= 48 && rand <= 57) || (rand >= 65 && rand <= 90)){
                if(!isExist(i,rand)){
                    code[i] = (char)rand;
                    i++;
                }
            }
        }
        return new String(code,0,code.length);
    }
    private boolean isExist(int num, int rand){
        boolean result = false;
        for(int i = 0; i < num; i++){
            if( code[i] == rand){
                result = true;
                break;
            }
        }
        return result;
    }
}