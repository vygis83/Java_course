package com.vygutis;

public class Main {

    public static void main(String[] args) {

        Account mano = new Account("Vygis");
        mano.deposit(1000);
        mano.withdraw(500);
        mano.withdraw(-23);
        mano.deposit(-98);
        mano.deposit(350);
        mano.calculateBalance();

        System.out.println("Balance is " + mano.getBalance());

    }
}
