package com.java.flow;

public class AlCapsDemo {
    public static void main(String[] arguments){
        String[] args = {"C:\\Users\\chenlilun\\Desktop\\test.txt"};
        if (args.length < 1) {
            System.out.println("You must specify a filename");
            System.exit(-1);
        }
        Allcaps cap = new Allcaps(args[0]);
        cap.convert();
    }
}
