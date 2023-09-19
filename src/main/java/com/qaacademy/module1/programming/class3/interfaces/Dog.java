package com.qaacademy.module1.programming.class3.interfaces;

public class Dog implements Pet, Wild {
    @Override
    public void play() {
        System.out.println("dog is playing...");
    }

    @Override
    public void hunt() {
        System.out.println("dog is hunting...");
    }
}
