package org.example.factory.exemple2;

public class Main {
    public static void main(String[] args) {
        IForme rectangle = FormeFactory.getForme("rectangle");
        rectangle.draw();

        IForme cercle = FormeFactory.getForme("cercle");
        cercle.draw();

    }
}