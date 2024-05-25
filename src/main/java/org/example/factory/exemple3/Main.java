package org.example.factory.exemple3;


public class Main {
    public static void main(String[] args) {
        Restaurant restaurantBeef = new BeefBurgerRestaurant();
        IBurger burger = restaurantBeef.orderBurger();

        Restaurant restaurantVeggie = new VeggieRestaurant();
        IBurger burgerVeggie = restaurantVeggie.orderBurger();
    }
}