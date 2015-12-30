package com.vygutis;

import java.util.ArrayList;

/**
 * Created by luksyvyg on 22/12/2015.
 */
public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public boolean addCustomer(String name, double amount) {
        if(findCustomer(name) != null) {
            System.out.println("Customer already exists in this branch.");
            return false;
        }
        Customer customer = new Customer(name, amount);
        this.customers.add(customer);
        System.out.println("Customer " + name + " created in " +
                this.name + " branch, initial transaction is " + amount);
        return true;
    }
    public boolean addTransaction(String name, double amount) {
        Customer customer = findCustomer(name);
        if(customer == null) {
            System.out.println("Customer " + name + " doesn't exist in this branch --> " + this.name);
            return false;
        }
        customer.addTransaction(amount);
        System.out.println("Transaction of " + amount + " in " + name + " account.");
        return true;
    }
    public void listCustomers() {
        for(int i=0; i<this.customers.size(); i++) {
            System.out.println(this.customers.get(i).getName());
        }
    }
    public void listCustomersAndTransactions() {
        for(int i=0; i<this.customers.size(); i++) {
            System.out.println(this.customers.get(i).getName() + " list of transactions: " +
                    this.customers.get(i).getTransactions());
        }
    }

    private Customer findCustomer(String name) {
        for(int i=0; i<this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if(customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
}
