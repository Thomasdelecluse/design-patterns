package org.example.factory.exemple1;

public class ComputerFactory {

    public Computer getComputer(String type){
        switch (type){
            case "pc":
                return new Pc("8go","1To Sata","2.3ghz");
            case "gamer":
                return new PcGamer("16go","1To Sata","4ghz");
            case "server":
                return new Server("128go","1To Sata","2.3ghz");
            default:
                return null;
        }
    }
}
