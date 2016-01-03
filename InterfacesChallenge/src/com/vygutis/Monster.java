package com.vygutis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vygis on 03/01/2016.
 */
public class Monster implements IStorage {
    private String name;
    private int attack;
    private int defence;

    public Monster(String name, int attack, int defence) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefence() {
        return defence;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defence=" + defence +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.attack);
        values.add(2, "" + this.defence);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() >0) {
            this.name = savedValues.get(0);
            this.attack = Integer.parseInt(savedValues.get(1));
            this.defence = Integer.parseInt(savedValues.get(2));
        }
    }
}
