package com.vygutis;

import java.util.ArrayList;

/**
 * Created by luksyvyg on 08/12/2015.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list");
        for (int i=0; i<groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    public String findItem(String searchItem) {
        boolean exists = groceryList.contains(searchItem);
        if (exists) {
            int position = groceryList.indexOf(searchItem);
            return groceryList.get(position);
        }
        return null;
    }
}
