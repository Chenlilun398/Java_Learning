package com.java.test;

/**
 * Created by viruser on 2018/9/22.
 */
public class SolderDemo {
    public static void main(String[] args) {
        Solder solder1 = new HaiSolder("zhangsan");
       // solder1.action();
        SirSolder solder2 = new SirSolder("sir");
        solder2.command(solder1);
        System.out.println("-------------------------------");
        solder2.command();
    }
}

abstract class Solder{
    private String name;
    public Solder(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void parpare(){
        System.out.println(name + "准备行动");
    }
    public void end(){
        System.out.println(name + "行动结束");
    }
    abstract void attack();
    public void action(){
        parpare();
        attack();
        end();
    }

    public void command(){};
}

class LuSolder extends Solder{
    public LuSolder(String name) {
        super(name);
    }
    public void attack(){
        System.out.println(getName() + "使用步枪");
    }
}


class HaiSolder extends Solder {
    public HaiSolder(String name) {
        super(name);
    }

    public void attack(){
        System.out.println(getName() +"使用鱼雷");
    }
}

class SirSolder extends Solder{
    public SirSolder(String name) {
        super(name);
    }

    public void attack(){
        System.out.println("使用手枪");
    }
    public void command(Solder solder) {
        System.out.println("command to :" + solder.getName());
        solder.action();
    }
    public void command(){
        System.out.println("全体攻击");
        this.action();
    }
}
