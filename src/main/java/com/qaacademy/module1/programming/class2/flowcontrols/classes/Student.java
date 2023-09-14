package com.qaacademy.module1.programming.class2.flowcontrols.classes;

public class Student {
    private String name;
    private String lastName;
    private String phone;

    public Student() {
        name = "";
        lastName = "";
        phone = "";
    }

    public Student(String name, String lastName, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void readBook() {
        System.out.println("leer un libro");
    }

    public String fullName() {
        return name + " " + lastName;
    }
}
