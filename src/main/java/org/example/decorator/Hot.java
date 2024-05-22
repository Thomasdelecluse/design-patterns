package org.example.decorator;

public class Hot extends SodaDecorator{
    public Hot(Soda soda) {
        super(soda);
    }

    @Override
    int price() {
        return soda.price() + 2;
    }

    @Override
    public String getDescription() {
        return soda.getDescription() + " hot";
    }
}
