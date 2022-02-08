package de.neuefische;

import validator.Validator;

public class Main {

    public static void main(String[] args) {
        String[] passwordArray = new String[3];
        passwordArray[0] = "HelloWorld1";
        passwordArray[1] = "HelloCoaches1";
        passwordArray[2] = "HelloStudents1";

        System.out.println(Validator.checkPasswordsHasConditionalsFromValidateMethod(passwordArray));
        System.out.println(Validator.createPassword("Hausgarten12"));
    }

}
