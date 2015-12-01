package com.vygutis;

public class Main {

    public static void main(String[] args) {

//        Animal animal = new Animal("Animal", 1, 1, 5, 5);
//
//        Dog dog = new Dog("Pupse", 8, 20, 2, 4, 1, 20, "white curly");
//        dog.eat();
//        dog.walk();
//        dog.run();

        //Challenge
        Car honda = new Car("Jazz", 4, 60, 5, "silver", 4, 5);
        honda.driving(honda.getSpeed());
        honda.changeGears(honda.getGears());
        Volvo mycar = new Volvo(90, 6, "red", "s40");
        mycar.driving(mycar.getSpeed());
        mycar.steering(mycar.getName(), mycar.getModel());


    }
}
