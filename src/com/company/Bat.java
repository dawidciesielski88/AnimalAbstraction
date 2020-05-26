package com.company;

public class Bat extends Animal implements ICanFly{
    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing");
    }

    @Override
    public void fly() {
        System.out.println("I'm not a bird but I can fly :)");
    }

    public Bat(String name) {
        super(name);

    }
}
