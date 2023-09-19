package com.qaacademy.module1.programming.class3.inheritance;

public class ToyotaVehicle extends Vehicle {
    private String modelName;

    public ToyotaVehicle() {
        modelName = "Hilux";
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void play(){
        brand = "cross";
    }
}
