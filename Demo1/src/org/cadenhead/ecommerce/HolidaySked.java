package org.cadenhead.ecommerce;

import java.util.*;
/**
 * Created by viruser on 2018/8/31.
 */
public class HolidaySked {
    BitSet sked;

    public HolidaySked(){
        sked = new BitSet(365);
        int[] holiday = {1, 15, 50, 148, 185, 246, 281, 316, 326, 359};
        for (int i = 0; i<holiday.length; i++){
            addHoliday(holiday[i]);
        }
    }

    public void addHoliday(int dayToAdd){
        sked.set(dayToAdd);
    }

    public boolean isHoliday(int dayToCheck){
        boolean result = sked.get(dayToCheck);
        return result;
    }

    public static void main(String[] args){
        HolidaySked cal = new HolidaySked();
        for(int i = 0; i < 365; i++ ){
            System.out.println(i + ":" + cal.sked.get(i));
        }
        /*
        if(args.length > 0){
            try{
                int whichDay = Integer.parseInt(args[0]);
                if (cal.isHoliday(whichDay)){
                    System.out.println("Day number " + whichDay + " is a holiday");
                }else{
                    System.out.println("Day number " + whichDay + " is not a holiday");
                }
            }catch (NumberFormatException nfe){
                System.out.println("Error: " + nfe.getMessage());
            }
        }
        */
    }
}