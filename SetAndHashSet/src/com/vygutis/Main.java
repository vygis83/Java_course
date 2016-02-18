package com.vygutis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<AstroObject.Key, AstroObject> solarSystem = new HashMap<>();
    private static Set<AstroObject> planets = new HashSet<>();

    public static void main(String[] args) {
        AstroObject temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        AstroObject tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        System.out.println("Planets");
        for(AstroObject planet : planets) {
            System.out.println(planet);
        }

        AstroObject body = solarSystem.get(AstroObject.makeKey("Earth", AstroObject.BodyTypes.PLANET));
        System.out.println("Moons of " + body.getKey());
        for (AstroObject moon : body.getSatellites()) {
            System.out.println("\t" + moon.getKey());
        }

        AstroObject earth1 = new Planet("Earth", 365);
        AstroObject earth2 = new Planet("Earth", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));

    }
}
