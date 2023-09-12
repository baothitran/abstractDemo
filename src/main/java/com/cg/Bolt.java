package com.cg;

public class Bolt extends Animal implements Barkable,Runable{
    @Override
    public void makeSound() {
        System.out.println("Gâu");
    }

    @Override
    public void bark() {
        System.out.println("Bolt is barking!");
    }

    @Override
    public void run() {
        System.out.println("Bolt is running");
    }
}
