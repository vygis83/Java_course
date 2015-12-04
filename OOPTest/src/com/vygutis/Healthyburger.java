package com.vygutis;

/**
 * Created by Vygis on 04/12/2015.
 */
public class Healthyburger extends Hamburger {

    private String healthytopping1Name;
    private double healthytopping1Price;

    private String healthytopping2Name;
    private double healthytopping2Price;

    public Healthyburger(String meat, double price) {
        super("Healthy", "brown rye", meat, price);
    }

    public void addhealthyTopping1 (String name, double price) {
        this.healthytopping1Name = name;
        this.healthytopping1Price = price;
    }
    public void addhealthyTopping2 (String name, double price) {
        this.healthytopping2Name = name;
        this.healthytopping2Price = price;
    }

    @Override
    public double makeHamburger() {
        double hamburgerPrice = super.makeHamburger();
        if(this.healthytopping1Name != null) {
            hamburgerPrice += this.healthytopping1Price;
            System.out.println("Added " + this.healthytopping1Name + " for an extra " + this.healthytopping1Price);
        }
        if(this.healthytopping2Name != null) {
            hamburgerPrice += this.healthytopping2Price;
            System.out.println("Added " + this.healthytopping2Name + " for an extra " + this.healthytopping2Price);
        }
        return hamburgerPrice;
    }
}
