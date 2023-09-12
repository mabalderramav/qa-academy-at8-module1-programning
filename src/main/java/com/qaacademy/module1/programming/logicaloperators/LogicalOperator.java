package com.qaacademy.module1.programming.logicaloperators;

public class LogicalOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;

//        if (x > y && x == 10) {
//            System.out.println("X es mayor que Y y X es igual que 10");
//        } else {
//            System.out.println("X no es mayor que Y o X no es igual que 10");
//        }

//        if (x > y || x == 10) {
//            System.out.println("X es mayor que Y o X es igual que 10");
//        } else {
//            System.out.println("X no es mayor que Y o X no es igual que 10");
//        }

        if (!(x > y) && x == 10) {
            System.out.println("X no es mayor que Y y X es igual que 10");
        } else {
            System.out.println("X es mayor que Y o X no es igual que 10");
        }

//        System.out.println(!(x > y) && x == 10); // false
        System.out.println(!(x > y) && x == 10); // true
    }
}
