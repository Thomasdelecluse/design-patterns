package org.example.factory.exemple2;

public class FormeFactory {
    public static IForme getForme(String type) {
        switch (type) {
            case "cercle":
                return new Cercle();
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
