package com.vygutis;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result++;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondScore = 160;
        if ((topScore > secondScore) || (topScore < 100))
            System.out.println("Greater than second top score and less then 100");

        boolean isCar = false;
        boolean wasCar = isCar ? true : false;

        // Challenge
        double first = 20d;
        double second = 80d;
        double total = (first + second) * 25;
        total %= 2300;
        if (total <= 200)
            System.out.println("Total was over the limit");

    }
}
