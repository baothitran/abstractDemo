package com.cg;

public class Siddeley extends Machine implements Flyable{
    @Override
    public void fly() {
        System.out.println("Siddeley is flying!");
    }
}
