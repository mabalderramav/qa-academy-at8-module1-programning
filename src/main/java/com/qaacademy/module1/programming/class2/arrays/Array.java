package com.qaacademy.module1.programming.class2.arrays;

public class Array {
    public static void main(String[] args) {
        // Array unidimensional
        String[] cars = {"Volvo", "Toyota", "Ford", "Jac"};

        System.out.println(cars[0]);
        System.out.println(cars[2]);

        // Array Multidimensional
        int[][] numbers = {{1,2,3,4},{5,6,7,8}};
        System.out.println(numbers[1][3]);
    }
}
