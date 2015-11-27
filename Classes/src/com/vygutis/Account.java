package com.vygutis;

/**
 * Created by luksyvyg on 27/11/2015.
 */
public class Account {

    private int number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Account() {
        this(12345, 1000, "Default", "Default", "Default");
        System.out.println("Constructor created");
    }

    public Account(int number, double balance, String name, String email, String phone) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
        System.out.println("Constructor with parameters created");
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumber() {
        return this.number;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhone() {
        return this.phone;
    }

    public void deposit(double funds) {
        this.balance += funds;
    }
    public void withdraw(double funds) {
        if(this.balance >= funds) {
            this.balance -= funds;
        } else {
            System.out.println("Sorry, you have only " + this.balance + " in your account.");
        }
    }
}
