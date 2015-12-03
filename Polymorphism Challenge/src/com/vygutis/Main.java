package com.vygutis;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }
    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "The vehicle is started";
    }
    public String accelerate() {
        return "The vehicle accelerates";
    }
    public String brake() {
        return "The vehicle has stopped";
    }
}

class Honda extends Car {
    public Honda() {
        super("Jazz", 4);
    }

    @Override
    public String startEngine() {
        return "Honda is started";
    }
    @Override
    public String accelerate() {
        return "Honda accelerates";
    }
    @Override
    public String brake() {
        return "Honda has stopped";
    }
}

class Volvo extends Car {
    public Volvo() {
        super("V40", 6);
    }

    @Override
    public String startEngine() {
        return "Volvo is started";
    }
    @Override
    public String accelerate() {
        return "Volvo accelerates";
    }
    @Override
    public String brake() {
        return "Volvo has stopped";
    }
}

class Fiat extends Car {
    public Fiat() {
        super("Punto", 3);
    }

    @Override
    public String startEngine() {
        return "Fiat is started";
    }
    @Override
    public String accelerate() {
        return "Fiat accelerates";
    }
    @Override
    public String brake() {
        return "Fiat has stopped";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i=0; i<5; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i +
                    " : " + car.getName() + "\n" +
                    "Start: " + car.startEngine() + "\n" +
                    "Accelerate: " + car.accelerate() + "\n" +
                    "Brake: " + car.brake() + "\n");
        }
    }

    public static Car randomCar() {
        int randNum = (int) (Math.random() * 3) + 1;
        System.out.println("Random number is " + randNum);
        switch (randNum) {
            case 1:
                return new Honda();
            case 2:
                return new Volvo();
            case 3:
                return new Fiat();
        }
        return null;
    }
}
