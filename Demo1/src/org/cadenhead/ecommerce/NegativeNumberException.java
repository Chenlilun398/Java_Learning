package org.cadenhead.ecommerce;

/**
 * Created by viruser on 2018/8/31.
 */
public class NegativeNumberException extends Exception {
    NegativeNumberException(){
        super();
    }

    NegativeNumberException(String message){
        super(message);
    }
}
