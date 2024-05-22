package org.example.decorator;

public class Fresh extends SodaDecorator{

    public Fresh(Soda soda) {
        super(soda);
    }


    @Override
    int price() {
        return soda.price() + 2;
    }

    @Override
    public String getDescription() {
        return soda.getDescription() + " Fresh";
    }
}
