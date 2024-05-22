package org.example.strategy;

public class CarContext {

    private ICar strategy;

    public CarContext(ICar carStrategy) {
        strategy = carStrategy;
    }

    public void executeStrategy(){
        strategy.Road();
    }

    public void setStrategy(ICar strategy){
        this.strategy = strategy;
    }
}
