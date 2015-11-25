package com.vygutis;

public class Main {

    public static void main(String[] args) {

//        int highscore = calculateScore(true, 800, 5, 100);
//        System.out.println("Your final score was " + highscore);
//
//        highscore = calculateScore(true, 10000, 8, 200);
//        System.out.println("Your final score was " + highscore);

        int pos = calculateHighScorePosition(1500);
        displayHighScorePosition("Vygis", pos);

        pos = calculateHighScorePosition(900);
        displayHighScorePosition("Lina", pos);

        pos = calculateHighScorePosition(400);
        displayHighScorePosition("Pupsis", pos);

        pos = calculateHighScorePosition(50);
        displayHighScorePosition("Sudas", pos);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    //challenge

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if ((score >= 500) && (score < 1000)) {
            return 2;
        } else if ((score >= 100) && (score < 500)) {
            return 3;
        } else {
            return 4;
        }
    }

}
