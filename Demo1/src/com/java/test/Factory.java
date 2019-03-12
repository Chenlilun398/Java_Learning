package com.java.test;

/**
 * Created by viruser on 2018/9/22.
 */
public class Factory {
    public static IProduct getProduct(String product){
        if(product.equals("A")){
            return new ProducrA();
        }else if(product.equals("B")){
            return new ProductB();
        }else{
            return null;
        }
    }
}

interface IProduct{
    String fun();
}

class ProducrA implements IProduct{
    public String fun(){
        return "get productA";
    }
}
class ProductB implements IProduct{
    public String fun(){
        return "get productB";
    };
}

class Tester{
    public static void main(String[] args) {
        IProduct product = Factory.getProduct("C");
        if(product != null){
            System.out.println(product.fun());
        }else{
            System.out.println("sorry");
        }
    }
}