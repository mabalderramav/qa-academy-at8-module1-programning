package com.qaacademy.module1.programming.class1.datatype;

public class DataType {

    public static void main(String[] args) {
        // Numerico

        // Declarar y asingnar variable
        byte myNumByte = 100; // -128 a 127
        System.out.println(myNumByte);

        // Declarar variable
        short myNumberShort; // -32,768 to 32,767

        // Asgnar variable
        myNumberShort = 32767;
        System.out.println(myNumberShort);

        int myNumberInt = 100000; // -2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1)
        System.out.println(myNumberInt);

        long myNumberLong = 15000000000L; // -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)
        System.out.println(myNumberLong);

        // Punto Flotante
        float myNumberFloat = 6.86f; // single-precision 32-bit
        System.out.println(myNumberFloat);

        double myNumberDouble = 19.3698567458d; // double-precision 64-bit
        System.out.println(myNumberDouble);

        String greeting = "Hello world";
        System.out.println(greeting);

        boolean isJavaFun = true;
        System.out.println(isJavaFun);

        char myGrade = 'D';
        System.out.println(myGrade);
    }
}
