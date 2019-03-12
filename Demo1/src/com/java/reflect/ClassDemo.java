package com.java.reflect;

/**
 * Created by viruser on 2018/11/24.
 */
public class ClassDemo {
    public static void main(String[] args) {
        Employee employee = new Employee(20,"zhangsan");
        Class<? extends  Employee> classType = employee.getClass();
        //System.out.println(employee.getClass());
        System.out.println(classType);
        System.out.println(classType.getName());
        System.out.println(classType.getSuperclass());

        //类名.class
        System.out.println("--------------------------------------------------");
        Class<?> classType2 = Employee.class;
        System.out.println(classType2);
    }
}

class Employee{
    private int age;
    private String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
