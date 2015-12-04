package com.vygutis;

/**
 * Created by Vygis on 04/12/2015.
 */
public class Deluxeburger extends Hamburger {
    public Deluxeburger() {
        super("Deluxe", "Multiseed", "Beef", 9.45);
        super.addTopping1("Chips", 2.5);
        super.addTopping2("Drink", 2);
    }

    @Override
    public void addTopping1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger!");
    }
    @Override
    public void addTopping2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger!");
    }
    @Override
    public void addTopping3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger!");
    }
    @Override
    public void addTopping4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger!");
    }
}
