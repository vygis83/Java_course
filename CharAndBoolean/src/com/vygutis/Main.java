package com.vygutis;

public class Main {

    public static void main(String[] args) {
        char myChar = '\u00A9';
        System.out.println(myChar);

        String myString = "This is my string!";
        System.out.println(myString);
        myString = myString + " " + myChar;
        System.out.println(myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("The result is " + lastString);
        double doubleNumber = 120.45;
        lastString = lastString + doubleNumber;
        System.out.println("The result is " + lastString);

        //Challenge

        char myChal = '\u00AE';
        System.out.println(myChal);
    }
}
