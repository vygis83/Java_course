package com.vygutis;

/**
 * Created by luksyvyg on 01/12/2015.
 */
public class Car extends Vehicle {

    private String color;
    private int doors;
    private int seats;

    public Car(String name, int wheels, int speed, int gears, String color, int doors, int seats) {
        super(name, wheels, speed, gears);
        this.color = color;
        this.doors = doors;
        this.seats = seats;
    }

    public void driving(int speed) {
        System.out.println("Driving this car");
        super.moving(speed);
    }
}
