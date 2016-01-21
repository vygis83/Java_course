package com.vygutis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your number here: ");
//        int x = scanner.nextInt();

        X x = new X(new Scanner(System.in));
//        scanner.nextLine();

        x.x();
    }
}
