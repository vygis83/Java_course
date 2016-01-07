package com.vygutis;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by luksyvyg on 07/01/2016.
 */
public class League<T extends Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
    }

    public void printTable() {
        System.out.println(getName() + " table:\n");
        if (league.isEmpty()) {
            System.out.println("No teams in this league!");
        }
        Collections.sort(league);
        for (T i : league) {
            System.out.println(i.getName() + " : " + i.ranking());
        }
    }
}
