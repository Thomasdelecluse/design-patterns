package org.example.factory.exemple1;

public class ComputerFactory {

    public Computer getComputer(String type){
        return switch (type) {
            case "pc" -> new Pc("8go", "1To Sata", "2.3ghz");
            case "gamer" -> new PcGamer("16go", "1To Sata", "4ghz");
            case "server" -> new Server("128go", "1To Sata", "2.3ghz");
            default -> null;
        };
    }
}
