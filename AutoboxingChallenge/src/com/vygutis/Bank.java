package com.vygutis;

import java.util.ArrayList;

/**
 * Created by luksyvyg on 22/12/2015.
 */
public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        if(findBranch(name) == null){
            System.out.println("New branch opened --> " + name);
            Branch branch = new Branch(name);
            this.branches.add(branch);
            return true;
        }
        return false;
    }
    public void addCustomer(String branchName, String custName, double amount) {
        Branch branch = findBranch(branchName);
        if(branch == null){
            System.out.println("Branch " + branchName + " doesn't exist!");
        } else {
            branch.addCustomer(custName, amount);
        }
    }
    public void addTransaction(String branchName, String custName, double amount) {
        Branch branch = findBranch(branchName);
        if(branch == null){
            System.out.println("Branch " + branchName + " doesn't exist!");
        } else {
            branch.addTransaction(custName, amount);
        }
    }
    public boolean listCustomers(String branchName, boolean transactions) {
        Branch branch = findBranch(branchName);
        if(branch == null){
            System.out.println("Branch " + branchName + " doesn't exist!");
            return false;
        }
        if(transactions) {
            System.out.println("The list of customers and transactions in branch " + branchName);
            branch.listCustomersAndTransactions();
            return true;
        }
        System.out.println("The list of customers in branch " + branchName);
        branch.listCustomers();
        return true;
    }

    private Branch findBranch(String name) {
        for(int i=0; i<this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if(branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }
}
