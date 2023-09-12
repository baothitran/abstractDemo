package com.cg;

public class McQueen extends Machine implements Runable{
    @Override
    public void run() {
        System.out.println("McQueen is running!");
    }
}
