package com.vygutis;

/**
 * Created by luksyvyg on 02/12/2015.
 */
public class Kitchen {

    private String color;
    private int windows;
    private Cooker cooker;
    private Table table;
    private Fridge fridge;

    public Kitchen(String color, int windows, Cooker cooker, Table table, Fridge fridge) {
        this.color = color;
        this.windows = windows;
        this.cooker = cooker;
        this.table = table;
        this.fridge = fridge;
    }

    public void readyToCook() {
        fridge.powerOn();
        cookDinner();

    }

    public void cookDinner () {
        cooker.cook(180);
    }


//    public String getColor() {
//        return color;
//    }
//    public int getWindows() {
//        return windows;
//    }
//    public Cooker getCooker() {
//        return cooker;
//    }
//    public Table getTable() {
//        return table;
//    }
//    public Fridge getFridge() {
//        return fridge;
//    }
}
