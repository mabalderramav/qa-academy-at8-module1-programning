package com.qaacademy.module1.programming.class3.abstractclass;

public abstract class Persona {
    private String name;
    private String lastName;

    public Persona() {
        name = "";
        lastName = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("Camino a las clase.");
    }

    public String play(final String phone) {
        return phone.concat(" + 5698");
    }
}
