package com.vygutis;

public class Main {

    public static void main(String[] args) {
//        Car porshe = new Car();
//        Car honda = new Car();
//        porshe.setModel("Carrera");
//        System.out.println("Model is " + porshe.getModel());

        //Account vygis = new Account(12345, 1000, "Vygintas L", "vygutis@kukutis.kuku", "12345678");
        Account vygis = new Account();
//        vygis.setNumber(123456);
//        vygis.setBalance(1000d);
//        vygis.setName("Vygintas L");
//        vygis.setEmail("vygutis@kukutis.kuku");
//        vygis.setPhone("010203");

        System.out.println("Account number: " + vygis.getNumber());
        System.out.println("Balance: " + vygis.getBalance());
        System.out.println("Name: " + vygis.getName());
        System.out.println("Email: " + vygis.getEmail());
        System.out.println("Phone number: " + vygis.getPhone());

        vygis.deposit(200.0d);
        System.out.println("Balance: " + vygis.getBalance());
        vygis.withdraw(800);
        System.out.println("Balance: " + vygis.getBalance());
        vygis.withdraw(800);
        System.out.println("Balance: " + vygis.getBalance());
    }
}
