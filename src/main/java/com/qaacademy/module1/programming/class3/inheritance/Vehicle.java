package com.qaacademy.module1.programming.class3.inheritance;

public class Vehicle {
    protected String brand;

    public Vehicle() {
        brand = "";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void honk() {
        System.out.println("tutututut, tututut");
    }
}
