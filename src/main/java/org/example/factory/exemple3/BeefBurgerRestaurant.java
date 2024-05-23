package org.example.factory.exemple3;

public class BeefBurgerRestaurant extends Restaurant{
    @Override
    public IBurger createBurger() {
        return new BeefBurger();
    }
}
