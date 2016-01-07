package com.vygutis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

//        ArrayList<Integer> items = new ArrayList<>();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add(4);
//        items.add(5);
//
//        printDoubled(items);
//    }
//
//    private static void printDoubled(ArrayList<Integer> n) {
//        for (int i : n) {
//            System.out.println(i * 2);
//        }

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        RugbyPlayer nick = new RugbyPlayer("Nick");

        Team<FootballPlayer> zalgiris = new Team<>("Kauno Zalgiris");
        zalgiris.addPlayer(joe);
//        zalgiris.addPlayer(pat);
//        zalgiris.addPlayer(nick);

        System.out.println(zalgiris.numPlayers());

        Team<BaseballPlayer> baseball = new Team<>("White Sox");
        baseball.addPlayer(pat);

        Team<RugbyPlayer> leinster = new Team<>("Leinster");
        leinster.addPlayer(nick);

        Team<FootballPlayer> real = new Team<>("Real Madrid");
        FootballPlayer ronaldo = new FootballPlayer("Gasol");
        real.addPlayer(ronaldo);

        Team<FootballPlayer> rytas = new Team<>("Lietuvos Rytas");
        Team<FootballPlayer> barcelona = new Team<>("BC Barcelona");

        zalgiris.matchResult(rytas, 2, 0);
        zalgiris.matchResult(real, 4, 8);

        barcelona.matchResult(rytas, 4, 1);
        barcelona.matchResult(zalgiris, 1, 1);

        System.out.println("Rankings");
        System.out.println(zalgiris.getName() + " : " + zalgiris.ranking());
        System.out.println(rytas.getName() + " : " + rytas.ranking());
        System.out.println(real.getName() + " : " + real.ranking());
        System.out.println(barcelona.getName() + " : " + barcelona.ranking());

        System.out.println(zalgiris.compareTo(rytas));
        System.out.println(real.compareTo(zalgiris));
        System.out.println(zalgiris.compareTo(barcelona));

//        ArrayList<Team> teams = new ArrayList<>();
//        teams.add(zalgiris);
//        teams.add(rytas);
//        teams.add(real);
//        teams.add(barcelona);
//        printList(teams);
//
//        Collections.sort(teams);
//        System.out.println("\n");
//        printList(teams);

        League<Team<FootballPlayer>> euroleague = new League<>("Euroleague");
        euroleague.addTeam(zalgiris);
        euroleague.addTeam(rytas);
        euroleague.addTeam(real);
        euroleague.addTeam(barcelona);

        euroleague.printTable();

        League<Team<RugbyPlayer>> league = new League<>("League");
        league.printTable();
    }

//    private static void printList(ArrayList<Team> t) {
//        for (Team i : t) {
//            System.out.println(i.getName());
//        }
//    }
}
