package com.qaacademy.module1.programming.class2.enumclass;

public class EnumClass {
    public static void main(String[] args) {
        String category = "EASY";
        if (Levels.EASY.toString().equals(category)) {
            System.out.println("El juego sera facil.");
        } else if (Levels.MIDDLE.toString().equals(category)) {
            System.out.println("El juego sera medio");
        } else if (Levels.HARD.toString().equals(category)) {
            System.out.println("El juego sera dificil");
        } else {
            System.out.println("El nivel no existe en el jeugo");
        }
    }
}
