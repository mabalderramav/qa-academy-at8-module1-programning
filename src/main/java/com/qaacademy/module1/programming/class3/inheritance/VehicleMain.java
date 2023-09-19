package com.qaacademy.module1.programming.class3.inheritance;

public class VehicleMain {
    public static void main(String[] args) {
        ToyotaVehicle toyotaVehicle = new ToyotaVehicle();
        toyotaVehicle.honk();
        System.out.println(toyotaVehicle.getBrand());
        System.out.println(toyotaVehicle.getModelName());
        System.out.println(toyotaVehicle.brand);
        VehicleMain.Play();
    }

    public static String Play(){
        return "playing...";
    }
}
