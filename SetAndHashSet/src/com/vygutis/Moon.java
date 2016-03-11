package com.vygutis;

/**
 * Created by luksyvyg on 18/02/2016.
 */
public class Moon extends AstroObject {

    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
