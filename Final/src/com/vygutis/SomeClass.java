package com.vygutis;

/**
 * Created by Vygis on 23/01/2016.
 */
public class SomeClass {

    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
