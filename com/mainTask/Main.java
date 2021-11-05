package com.mainTask;

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setBrand("Stels");
        bicycle.setModel("Mountain bike");
        bicycle.setUsed(true);
        bicycle.run();
    }
}