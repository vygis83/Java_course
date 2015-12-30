package com.vygutis;


public class Main {

    public static void main(String[] args) {

//        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
//        for (int i=0; i<=20; i+=2) {
//            integerArrayList.add(Integer.valueOf(i));
//        }
//
//        for (int i=0; i<=5; i++) {
//            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
//        }

        Bank bank = new Bank("Sekunde");
        bank.addBranch("Kaunas");
        bank.addCustomer("Kaunas", "Lina", 1000.0);
        bank.addCustomer("Dublin", "Lina", 1000.0);
        bank.addCustomer("Kaunas", "Vygis", 500.0);
        bank.addCustomer("Kaunas", "Pupsis", 100.0);
        bank.addTransaction("Kaunas", "Lina", 100.0);
        bank.addTransaction("Kaunas", "Lina", -300.0);
        bank.addTransaction("Kaunas", "Lina", 400.0);
        bank.addTransaction("Kaunas", "Pupsis", -500.0);
        bank.listCustomers("Kaunas", true);
        bank.listCustomers("Kaunas", false);

        System.out.println("\n");

        Branch dublin = new Branch("Dublin");
        dublin.addCustomer("Vygis", 500.0);
        dublin.addTransaction("Vygis", -200.0);
        dublin.addTransaction("Lina", -200.0);


    }
}
