package com.qaacademy.module1.programming.class3.abstractclass;

public class AbstractMain {
    public static void main(String[] args) {
        // Persona student = new Persona();
        Student student = new Student();
        student.setName("Jaime");
        student.setLastName("Vaca");

        System.out.println(student.getName().concat(" ").concat(student.getLastName()));
        student.eat();
        student.walk();

        Trainner trainner = new Trainner();
        trainner.setName("Jorge");
        trainner.setLastName("Vargas");

        System.out.println(trainner.getName().concat(" ").concat(trainner.getLastName()));
        trainner.eat();
        trainner.walk();
    }
}
