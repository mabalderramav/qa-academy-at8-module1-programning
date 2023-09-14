package com.qaacademy.module1.programming.class2.flowcontrols.classes;

public class StudentEntry {
    public static void main(String[] args) {
        // Instanciar or objeto
        Student studentAldo = new Student("Aldo", "Vaca", "123");
        System.out.println("Mi nombre completo es " +  studentAldo.fullName());
    }
}
