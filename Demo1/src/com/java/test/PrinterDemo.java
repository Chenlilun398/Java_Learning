package com.java.test;

/**
 * Created by viruser on 2018/9/17.
 */
public class PrinterDemo {
    public static void main(String[] args) {

        School school = new School();
        BlackPrinter blackPrinter = new BlackPrinter("brand");
        school.setPrinter(blackPrinter);
        school.print("test");
    }
}

class Printer {
    private String brand;
    public Printer(String brand){
        this.brand = brand;
    }
    public void print(String content){}
    public String getBrand(){return brand;}
}

class ColorPrinter extends Printer {
    public ColorPrinter(String brand){
        super(brand);
    }
    public void print(String content) {
        System.out.println(getBrand()+"color print" + content);
    }
}

class BlackPrinter extends Printer {
    public BlackPrinter(String brand){
        super(brand);
    }
    public void print(String content) {
        System.out.println(getBrand()+"black print" + content);
    }
}

class School{
    private Printer printer;

    public void setPrinter(Printer printer) {this.printer = printer;}

    public void print(String content) {
        printer.print(content);
    }
}
