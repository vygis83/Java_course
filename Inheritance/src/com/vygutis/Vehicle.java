package com.vygutis;

/**
 * Created by luksyvyg on 01/12/2015.
 */
public class Vehicle {

    private String name;
    private int wheels;
    private int speed;
    private int gears;

    public Vehicle(String name, int wheels, int speed, int gears) {
        this.name = name;
        this.wheels = wheels;
        this.speed = speed;
        this.gears = gears;
    }

    public String getName() {
        return name;
    }
    public int getWheels() {
        return wheels;
    }
    public int getSpeed() {
        return speed;
    }
    public int getGears() {
        return gears;
    }

    public void steering(String name) {
        System.out.println("I'm steering " + name);
    }
    public void changeGears(int gears) {
        System.out.println("Changing gears from 1 to " + gears);
    }
    public void moving(int speed) {
        System.out.println("Moving at " + speed + " km/h");
    }
}
