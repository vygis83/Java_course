package com.vygutis;

import java.util.Scanner;

/**
 * Created by luksyvyg on 21/01/2016.
 */
public class X {

    private int x;

    public X(Scanner x) {
        System.out.println("Please enter your number here: ");
        this.x = x.nextInt();
    }

    public void x() {
        for (int x=1; x<13; x++) {
            System.out.println(x + " * " + this.x + " = " + (x * this.x));
        }
    }
}
