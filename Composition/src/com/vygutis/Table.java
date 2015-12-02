package com.vygutis;

/**
 * Created by luksyvyg on 02/12/2015.
 */
public class Table {

    private String color;
    private int width;
    private int length;
    private Chair chair;

    public Table(String color, int width, int length, Chair chair) {
        this.color = color;
        this.width = width;
        this.length = length;
        this.chair = chair;
    }

    public void diningSet(int chairs, int width, int length, String color) {
        int size = width * length;
        System.out.println("The size of table is " + size);
        System.out.println("It's " + color + " and has " + chairs + " chairs");
    }

}
