package com.qaacademy.module1.programming.class4.strategypattern;

import java.util.HashMap;
import java.util.Map;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        // Rellenar el formulario con todos los campos
        Map<FormFields, String> formFields = new HashMap<>();
        formFields.put(FormFields.FIRST_NAME, "Jhon"); // Requerido
        formFields.put(FormFields.LAST_NAME, "Vargas");
        formFields.put(FormFields.EMAIL, "example@gmail.com");
        formFields.put(FormFields.PHONE, "+59175896548"); // Requerido

        // Rellenar el formulario
        BrowserForm browserForm = new BrowserForm();
        browserForm.fillForm(formFields);

        // Rellenar solo como los campos requeridos
        System.out.println("----------------------------------------------");
        formFields.clear();
        formFields.put(FormFields.FIRST_NAME, "Aldo");
        formFields.put(FormFields.PHONE, "+59179856472");
        browserForm.fillForm(formFields);

        // Rellenar los compos que no son requeridos
        System.out.println("----------------------------------------------");
        formFields.clear();
        formFields.put(FormFields.LAST_NAME, "Vargas");
        formFields.put(FormFields.EMAIL, "example@gmail.com");
        browserForm.fillForm(formFields);
    }
}
