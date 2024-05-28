package org.example.adapter;

import org.example.factory.exemple1.Computer;
import org.example.factory.exemple1.ComputerFactory;

public class Main {
    public static void main(String[] args) {
        // Sans l'adapter
        Item[] item = new Item[6];
        item[0] = new Item("golden","roche");
        item[1] = new Item("cherry","cailloux");
        item[2] = new Item("cherry","roche");
        item[3] = new Item("golden","cailloux");

        item[0].pomme = "test";


        // Avec l'adapter on modifie un Item sans toucher a la classe Item ( get and set en plus)
        IItem[] itemAdapter = new IItem[6];
        itemAdapter[0] = new ItemAdapter("golden","roche");
        itemAdapter[1] = new ItemAdapter("cherry","cailloux");
        itemAdapter[2] = new ItemAdapter("cherry","roche");
        itemAdapter[3] = new ItemAdapter("golden","cailloux");

        itemAdapter[0].setPierre("cailloux");
        itemAdapter[1].setPomme("cherry");
    }
}