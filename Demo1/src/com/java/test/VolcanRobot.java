package com.java.test;

/**
 * Created by viruser on 2018/8/28.
 */
class VolcanoRobot {
    String status;
    int speed;
    float temperature;

    void checkTemperature() {
        if (temperature > 660) {
            status = "returning home";
            speed = 5;
            this.showAttributes();
        }
    }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }

    void checkTemperature(int temperature){
        if (temperature < 660){
            status = "test";
            speed = 5;
            this.temperature = temperature;
            this.showAttributes();
        }
    }
    public static void main(String[] args){
        VolcanoRobot rbt = new VolcanoRobot();
        rbt.checkTemperature(4);
        VolcanoRobot rbt2 = new VolcanoRobot();
        rbt2.checkTemperature();
    }
}
