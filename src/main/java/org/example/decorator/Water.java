package org.example.decorator;

public class Water extends Soda{


    public Water() {
        description = "Verre d'eau";
    }

    @Override
    int price() {
        return 1;
    }


}
