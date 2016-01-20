package com.vygutis;

import com.example.game.IStorage;
import com.example.game.Monster;
import com.example.game.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player vygis = new Player("Vygis", 10, 15);
        System.out.println(vygis);
        saveObject(vygis);

        vygis.setAttack(20);
        System.out.println(vygis);
        vygis.setWeapon("Bow");
        saveObject(vygis);
//        loadObject(vygis);
        System.out.println(vygis);

        IStorage werewolf = new Monster("Wolverine", 20, 15);
        System.out.println(((Monster) werewolf).getDefence());
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                    "1 to enter a string\n" +
                    "0 to quit");
        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter string: ");
                    String strInput = scanner.nextLine();
                    values.add(index, strInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(IStorage objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage");
        }
    }

    public static void loadObject(IStorage objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
