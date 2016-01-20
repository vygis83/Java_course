package com.example.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vygis on 02/01/2016.
 */
public class Player implements IStorage {
    private String name;
    private int attack;
    private int defence;
    private String weapon;

    public Player(String name, int attack, int defence) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getDefence() {
        return defence;
    }
    public void setDefence(int defence) {
        this.defence = defence;
    }
    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defence=" + defence +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.attack);
        values.add(2, "" + this.defence);
        values.add(3, this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() >0) {
            this.name = savedValues.get(0);
            this.attack = Integer.parseInt(savedValues.get(1));
            this.defence = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }
}
