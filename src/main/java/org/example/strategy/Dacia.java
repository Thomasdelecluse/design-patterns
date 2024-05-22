package org.example.strategy;

public class Dacia implements ICar {
    @Override
    public void Road() {
        System.out.println("La dacia ai en panne et ne peut pas rouler");
    }
}
