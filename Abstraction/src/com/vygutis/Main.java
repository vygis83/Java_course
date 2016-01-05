package com.vygutis;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog ("Pupsis");
        dog.eat();
        dog.breathe();

        Parrot bird = new Parrot("Parrot");
        bird.eat();
        bird.breathe();
        bird.fly();

        Penguin lolo = new Penguin("Emperor");
        lolo.fly();
    }
}
