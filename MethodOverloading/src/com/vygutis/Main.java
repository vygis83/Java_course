package com.vygutis;

public class Main {

    public static void main(String[] args) {
        calculateScore("Vygis", 500);
        calculateScore(100);
        calculateScore();

        //Challenge
        double foot = 6d;
        double inch = 6d;
        double inches = calcFeetAndInchesToCentimeters(foot, inch);
        System.out.println("My height is " + calcFeetAndInchesToCentimeters(inches) + " cm.");

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + ", score was " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown player, score was " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player, no score.");
        return -1;
    }

    //Challenge
    public static double calcFeetAndInchesToCentimeters(double foot, double inch) {
        if((foot >= 0) && ((inch >= 0) && (inch <=12))) {
            return (foot * 12) + inch;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inch) {
        if (inch >= 0) {
            return inch * 2.54;
        } else {
            return -1;
        }
    }
}
