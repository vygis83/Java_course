package com.vygutis;

/**
 * Created by Vygis on 05/01/2016.
 */
public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not good in this - I'll go for swim");
    }
}
