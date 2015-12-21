package com.vygutis;

import java.util.ArrayList;

/**
 * Created by luksyvyg on 21/12/2015.
 */
public class MobilePhone {

    private ArrayList<Contact> contactList;

    public MobilePhone() {
        this.contactList = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        this.contactList.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact.getName());
        if(position < 0) {
            System.out.println(oldContact.getName() + ", was not found!");
            return false;
        }
        this.contactList.set(position, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact.getName());
        if(position < 0) {
            System.out.println(contact.getName() + ", was not found!");
            return false;
        }
        this.contactList.remove(position);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    private int findContact(Contact contact) {
        return this.contactList.indexOf(contact);
    }

    private int findContact(String name) {
        for(int i=0; i<this.contactList.size(); i++) {
            Contact contact = this.contactList.get(i);
            if(contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >=0) {
            return contact.getName();
        }
        return null;
    }
    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >=0) {
            return this.contactList.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < this.contactList.size(); i++) {
            System.out.println((i + 1) + ". " + this.contactList.get(i).getName() +
                            " -> " + this.contactList.get(i).getNumber());
        }
    }
}
