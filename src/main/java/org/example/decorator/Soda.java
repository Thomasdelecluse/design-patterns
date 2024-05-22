package org.example.decorator;

public abstract class Soda {
    String description;
    abstract int price();
    public String getDescription(){
        return description;
    };
}
