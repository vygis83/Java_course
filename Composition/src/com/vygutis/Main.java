package com.vygutis;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20,5);

        Case theCase = new Case("icore5", "HP", "220", dimensions);

        Monitor theMonitor = new Monitor("Dell 23", "Dell", 23, new Resolution(640, 480));

        Motherboard motherboard = new Motherboard("BJ-200", "Samsung", 4, 6, "v1.2");


        PC thePC = new PC(theCase, theMonitor, motherboard);

//        thePC.getMonitor().drawPixelAt(230, 200, "green");
//        thePC.getMotherboard().loadProgram("Linux 5.0");
//        thePC.getTheCase().pressPowerButton();
//        thePC.powerUp();

        //Challenge
        Cooker cooker = new Cooker("Liepsna", true, false, 250);
        Table table = new Table("brown", 2, 3, new Chair("brown", 6));
        Fridge fridge = new Fridge("silver", "Snaige", -20);

        Kitchen kitchen = new Kitchen("white", 2, cooker, table, fridge);
//        kitchen.getCooker().cook(200);
//        kitchen.getTable().diningSet(6, 2, 3, "brown");
//        kitchen.getFridge().powerOn();
        kitchen.readyToCook();

    }
}
