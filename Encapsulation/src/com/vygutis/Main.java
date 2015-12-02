package com.vygutis;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Vygis";
//        player.health = 20;
//        player.weapon = "axe";
//
//        int damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        EnhancedPlayer player = new EnhancedPlayer("Vygis", 50, "sword");
//        System.out.println("Initial health is " + player.getHealth());

        //Challenge
        Printer printer = new Printer(50, true);
        printer.fillToner(20);
        System.out.println("Pages printed: " + printer.getPages());
        printer.print(103);
        System.out.println("Pages printed: " + printer.getPages());
    }
}
