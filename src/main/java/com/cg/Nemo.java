package com.cg;

public class Nemo extends Animal implements Swimable{
    @Override
    public void makeSound() {
        System.out.println("Bluuuuuu");
    }

    @Override
    public void swim() {
        System.out.println("Nemo is swimming!");
    }
}
