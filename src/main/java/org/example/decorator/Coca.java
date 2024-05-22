package org.example.decorator;

public class Coca extends Soda{
    public Coca() {
        description = "Verre de coca";
    }

    @Override
    int price() {
        return 3;
    }

}
