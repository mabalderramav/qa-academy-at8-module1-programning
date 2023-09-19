package com.qaacademy.module1.programming.class3.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismMain {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal pig = new Pig();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(dog);
        animalList.add(pig);

        // Programacion declarativa
        animalList.forEach(animal -> animal.sound());
    }
}
