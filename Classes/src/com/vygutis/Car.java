package com.vygutis;

/**
 * Created by luksyvyg on 27/11/2015.
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public Car(int doors, int wheels, String model, String engine, String color) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("jazz")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
