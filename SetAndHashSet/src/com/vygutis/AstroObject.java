package com.vygutis;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by luksyvyg on 02/02/2016.
 */
public final class AstroObject {
    private final String name;
    private final double orbitalPeriod;
    private final Set<AstroObject> satellites;

    public AstroObject(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(AstroObject moon) {
        return this.satellites.add(moon);
    }

    public Set<AstroObject> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((AstroObject) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode() called");
        return this.name.hashCode() + 57;
    }
}
