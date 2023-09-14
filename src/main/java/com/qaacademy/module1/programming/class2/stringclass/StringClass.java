package com.qaacademy.module1.programming.class2.stringclass;

public class StringClass {
    public static void main(String[] args) {
        String name = "Oscar";
        String lastName = "Vargas";

        // Concat String
        System.out.println(name + " " + lastName); // Avoid

        String fullName = name.concat(" ").concat(lastName);
        System.out.println(fullName);

        // Compare String
        String fullNameCopy = fullName;
        System.out.println(fullNameCopy.equals(fullName)); // true
        System.out.println(fullNameCopy == fullName); // true

        // Find text on string
        System.out.println(fullName.indexOf("Va")); // 6
        System.out.println(fullName.indexOf("car")); // 2

        // Start and End with
        System.out.println(fullName.startsWith("Al")); // False
        System.out.println(fullName.startsWith("O")); // True
        System.out.println(fullName.startsWith("Oscar")); // True

        System.out.println(fullName.endsWith("s")); // true
        System.out.println(fullName.endsWith("S")); // false
        System.out.println(fullName.endsWith("Vargas")); // true
    }
}
