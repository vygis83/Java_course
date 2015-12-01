package com.vygutis;

/**
 * Created by luksyvyg on 01/12/2015.
 */
public class Volvo extends Car{

    private String model;

    public Volvo(int speed, int gears, String color, String model) {
        super("Volvo", 4, speed, gears, color, 4, 5);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void steering(String name, String model) {
        System.out.println("I'm driving  " + name + " " + model);
        super.steering(name);
    }
}
