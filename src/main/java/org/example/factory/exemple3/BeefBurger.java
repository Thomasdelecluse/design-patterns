package org.example.factory.exemple3;

public class BeefBurger implements IBurger{
    @Override
    public void prepare() {
        //bacon
        //beef
        System.out.println("Beef Burger");
    }
}
