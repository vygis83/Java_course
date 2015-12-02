package com.vygutis;

/**
 * Created by luksyvyg on 02/12/2015.
 */
public class Fridge {

    private String color;
    private String make;
    private int minTemp;

    public Fridge(String color, String make, int minTemp) {
        this.color = color;
        this.make = make;
        this.minTemp = minTemp;
    }

    public void powerOn() {
        System.out.println("Fridge is powered on!");
    }
}
