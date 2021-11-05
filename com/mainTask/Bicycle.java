package com.mainTask;

import lombok.Data;

@Data
public class Bicycle {
    private String brand;
    private String model;
    private boolean used;

    public void run() {
        System.out.println(brand + " " + model + " is riding."
                + (used ? " Bicycle seems to be used." : " Bicycle seems to be new."));
    }
}