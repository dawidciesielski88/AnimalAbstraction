package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog ("Buzz");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Flier");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Rick");
        penguin.eat();
        penguin.breathe();
        penguin.fly();

        Bat bat = new Bat("Dracula");
        bat.breathe();
        bat.eat();
        bat.fly();
    }
}
