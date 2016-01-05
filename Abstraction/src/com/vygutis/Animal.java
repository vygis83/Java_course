package com.vygutis;

/**
 * Created by Vygis on 05/01/2016.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();
    public abstract void breathe();
}
