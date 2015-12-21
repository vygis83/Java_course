package com.vygutis;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myContacts = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myContacts.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    query();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print menu.");
        System.out.println("\t 1 - To print list of contacts.");
        System.out.println("\t 2 - To add new contact.");
        System.out.println("\t 3 - To update existing contact.");
        System.out.println("\t 4 - To remove contact from the list.");
        System.out.println("\t 5 - To find contact.");
        System.out.println("\t 6 - To quit the application");
    }
    private static void addContact() {
        System.out.println("Please enter name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter phone number: ");
        String number = scanner.nextLine();
        Contact entry = Contact.createContact(name, number);
        myContacts.addContact(entry);
        if(myContacts.addContact(entry)) {
            System.out.println("New contact added: name = " + name + ", phone = " + number);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }
    private static void update() {
        System.out.println("Enter contact name to update: ");
        String name = scanner.nextLine();
        Contact oldEntry = myContacts.queryContact(name);
        if(oldEntry == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String newNumber = scanner.nextLine();
        Contact newEntry = Contact.createContact(newName,newNumber);
        myContacts.updateContact(oldEntry,newEntry);
    }
    private static void remove() {
        System.out.println("Enter contact name to remove: ");
        String name = scanner.nextLine();
        Contact entry = myContacts.queryContact(name);
        myContacts.removeContact(entry);
    }
    private static void query() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact oldEntry = myContacts.queryContact(name);
        if(oldEntry == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + oldEntry.getName() + " phone number is " + oldEntry.getNumber());
    }

}
