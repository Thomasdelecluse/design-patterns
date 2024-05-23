package org.example.factory.exemple1;

public class Main {
    public static void main(String[] args) {
        Computer pc = new ComputerFactory().getComputer("pc");
        System.out.println(pc);

        Computer server = new ComputerFactory().getComputer("server");
        System.out.println(server);

        Computer pcGamer = new ComputerFactory().getComputer("gamer");
        System.out.println(pcGamer);
    }
}