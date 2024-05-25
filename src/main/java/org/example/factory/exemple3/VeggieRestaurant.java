package org.example.factory.exemple3;

public class VeggieRestaurant extends Restaurant{
    @Override
    public IBurger createBurger() {
        return new VeggieBurger();
    }
}
