package com.vygutis;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger burger = new Hamburger("Basic", "White", "Sausage", 3.52);
        burger.addTopping1("Tomato", 0.34);
        burger.addTopping2("Cheese", 0.89);
        burger.addTopping3("Lettuce", 0.57);
        System.out.println("Total burger price is " + burger.makeHamburger());

        Healthyburger healthy = new Healthyburger("Chicken", 4.23);
        healthy.addTopping1("Egg", 1.22);
        healthy.addhealthyTopping1("Cucumber", 0.45);
        System.out.println("Total burger price is " + healthy.makeHamburger());

        Deluxeburger db = new Deluxeburger();
        db.addTopping2("shit", 59);
        System.out.println("Total burger price is " + db.makeHamburger());
    }
}
