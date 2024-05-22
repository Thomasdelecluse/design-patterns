package org.example.decorator;

public abstract class SodaDecorator extends Soda{
    Soda soda = null;
    public SodaDecorator(Soda soda) {
        this.soda = soda;
    }
}
