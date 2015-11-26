package com.vygutis;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(calculateInterest(10000,2));

        for(int i=1; i<6; i++) {
            System.out.println(i + ") Hello!");
        }
//challenge
//        for(int i=2; i<9; i++) {
//            System.out.println("The interest of " + i + " % interest rate is " + calculateInterest(10000,i));
//        }
//
//        for(int i=8; i>1; i--) {
//            System.out.println("The interest of " + i + " % interest rate is " + calculateInterest(10000,i));
//        }

        System.out.println(isPrime(16));
        int n = 0;
        for(int i=1; i<=100; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                n ++;
            }
            if(n == 10) {
                System.out.println("Exiting...");
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double rate) {
        return (amount * (rate/100.0));
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
