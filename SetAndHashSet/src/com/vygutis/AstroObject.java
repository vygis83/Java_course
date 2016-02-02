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
}
