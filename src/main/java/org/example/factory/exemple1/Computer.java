package org.example.factory.exemple1;

public abstract class Computer {

    public abstract String getRam();

    public abstract String getHdd();

    public abstract String getCpu();

    @Override
    public String toString() {
        return "Ma configuration : ram :: "+ getRam() +" Hdd :: "+ getHdd()+ " Cpu :: "+ getCpu();
    }
}
