package org.example.factory.exemple2;

public class Main {
    public static void main(String[] args) {
        IForme rectangle = new FormeFactory().getForme("rectangle");
        rectangle.draw();

        IForme cercle = new FormeFactory().getForme("cercle");
        cercle.draw();

    }
}