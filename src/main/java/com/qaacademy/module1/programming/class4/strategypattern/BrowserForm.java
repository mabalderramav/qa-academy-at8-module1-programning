package com.qaacademy.module1.programming.class4.strategypattern;

import java.util.EnumMap;
import java.util.Map;

public class BrowserForm {
    public void fillForm(Map<FormFields, String> formFields) {
        formFields.keySet().forEach(step -> getStrategyMap(formFields).get(step).executeStep());
    }

    private Map<FormFields, StrategySetterStep> getStrategyMap(Map<FormFields, String> formFields) {
        EnumMap<FormFields, StrategySetterStep> stepMap = new EnumMap<>(FormFields.class);
        stepMap.put(FormFields.FIRST_NAME, () -> setFirstName(formFields.get(FormFields.FIRST_NAME)));
        stepMap.put(FormFields.LAST_NAME, () -> setLastName(formFields.get(FormFields.LAST_NAME)));
        stepMap.put(FormFields.EMAIL, () -> setEmail(formFields.get(FormFields.EMAIL)));
        stepMap.put(FormFields.PHONE, () -> setPhone(formFields.get(FormFields.PHONE)));

        return stepMap;
    }

    private void setPhone(String value) {
        System.out.println("Set phone :".concat(value));
    }

    private void setEmail(String value) {
        System.out.println("Set email :".concat(value));
    }

    private void setLastName(String value) {
        System.out.println("Set last name :".concat(value));
    }

    private void setFirstName(String value) {
        System.out.println("Set first name :".concat(value));
    }
}
