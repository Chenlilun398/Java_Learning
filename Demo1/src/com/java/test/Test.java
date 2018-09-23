package com.java.test;


/**
 * Created by viruser on 2018/9/22.
 */
public class Test {
    public static void main(String[] args) {
        School school = new School();
        Teacher teacher = new Teacher("zhangsan",30);
        ColorPrinter colorPrinter = new ColorPrinter("apple ");
        BlackPrinter blackPrinter = new BlackPrinter("microsoft");
        school.setPrinter(colorPrinter);
        school.print(school);
    }
}

abstract class Printer{
    private String brand;
    public Printer(String brand) {
        this.brand = brand;
    }
    public abstract void print(String content);
    public String getBrand(){
        return brand;
    }
}

class ColorPrinter extends Printer{
    public ColorPrinter(String brand) {
        super(brand);
    }
    public void print(String content) {
        System.out.println(getBrand() + " color print :" + content);
    }
}

class BlackPrinter extends Printer{
    public BlackPrinter(String brand) {
        super(brand);
    }
    public void print(String content) {
        System.out.println(getBrand() + " black print :" + content);
    }
}

class School implements IInfo{
    private Printer printer;
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
    public void print(IInfo info){
        printer.print(info.detail());
    }
    public String detail(){
        return "Haitong keji youxiangongsi";
    }
}

class Teacher implements IInfo{
    private String name;
    private int age;
    public Teacher(String name ,int age) {
        this.name = name;
        this.age = age;
    }
    public String detail(){
        return "my name is "+ name + " , I'am " + age + " years old";
    }
}

interface IInfo{
    String detail();
}
