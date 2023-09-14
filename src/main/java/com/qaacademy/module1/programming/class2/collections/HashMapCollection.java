package com.qaacademy.module1.programming.class2.collections;

import com.qaacademy.module1.programming.class2.flowcontrols.classes.Student;

import java.util.HashMap;

public class HashMapCollection {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Bolivia" , "La Paz");
        capitalCities.put("Bolivia1" , "Sucre");

        System.out.println(capitalCities);
    }
}
