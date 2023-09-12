package com.cg;

public class AngryBird extends Animal implements Flyable{
    @Override
    public void makeSound() {
        System.out.println("Chíp");
    }

    @Override
    public void fly() {
        System.out.println("Angry Bird is flying!");
    }
}
