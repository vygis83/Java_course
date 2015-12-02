package com.vygutis;

/**
 * Created by luksyvyg on 02/12/2015.
 */
public class Cooker {

    private String name;
    private boolean electric;
    private boolean gas;
    private int maxTemp;

    public Cooker(String name, boolean electric, boolean gas, int maxTemp) {
        this.name = name;
        this.electric = electric;
        this.gas = gas;
        this.maxTemp = maxTemp;
    }

    public void cook(int maxTemp) {
        System.out.println("Cooking dinner at " + maxTemp + " degrees!" );
    }


}
