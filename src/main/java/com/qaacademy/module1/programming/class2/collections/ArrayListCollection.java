package com.qaacademy.module1.programming.class2.collections;

import com.qaacademy.module1.programming.class2.flowcontrols.classes.Student;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> carsList = new ArrayList<>();
        carsList.add("Volvo");
        carsList.add("Toyota");
        carsList.add("Toyota");
        carsList.add("BMW");
        carsList.add("Jac");

        System.out.println(carsList);

        // Programacion Imperativa - Como?
        for (String item : carsList) {
            System.out.println(item);
        }

        System.out.println("---------------------------------");
        // Programacion Declarativo - Que?
        carsList.forEach(car -> System.out.println(car));
    }
}
