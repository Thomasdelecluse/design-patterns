package org.example.strategy;

public class Main {
    public static void main(String[] args) {
        CarContext strategy = new CarContext(new Audi());
        strategy.executeStrategy();
        strategy.setStrategy(new Ferrari());
        strategy.executeStrategy();
        strategy.setStrategy(new Dacia());
        strategy.executeStrategy();
    }
}