package com.vygutis;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myInt = 5 / 3; // int = 32 bits
        float myFloat = 5f / 3f; // float = 32 bits
        double myDouble = 5d / 3d; // double = 64 bits

        System.out.println("myInt = " + myInt);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);

        // Challenge

        double pounds = 200d;
        double kilos = pounds * 0.45359237d;
        System.out.println("Kilograms = " + kilos);
    }
}
