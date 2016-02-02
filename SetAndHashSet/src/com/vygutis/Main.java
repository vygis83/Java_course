package com.vygutis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, AstroObject> solarSystem = new HashMap<>();
    private static Set<AstroObject> planets = new HashSet<>();

    public static void main(String[] args) {
        AstroObject temp = new AstroObject("Mercusry", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new AstroObject("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new AstroObject("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        AstroObject tempMoon = new AstroObject("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        System.out.println("Planets");
        for(AstroObject planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        AstroObject body = solarSystem.get("Earth");
        System.out.println("Moons of " + body.getName());
        for (AstroObject moon : body.getSatellites()) {
            System.out.println("\t" + moon.getName());
        }

    }
}
