package com.vygutis;

/**
 * Created by Vygis on 05/01/2016.
 */
public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathing bird");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
