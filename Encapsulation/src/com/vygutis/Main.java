package com.vygutis;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.name = "Vygis";
        player.health = 20;
        player.weapon = "axe";

        int damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }
}
