package de.neuefische;

public class Validator {

    public static final String ERROR_PASSWORD_SIZE_TO_SHORT = "failed to set password. Minimum size is 9";
    public static final String ERROR_PASSWORD_REQUIRE_NUMBERS = "failed to set password. At least 1 Numbers required.";
    public static final String PASSWORD_IS_SUCCESSFULLY_CREATED = "Password is successfully created";
    public static final String ERROR_PASSWORD_HAS_NOT_LOWER_AND_UPPERCASE = "Password has not uppercase and lowercase";

    public static String createPassword(String password) {
        return validate(password);
    }

    private static String validate(String password) {
        if (password.length() < 10) {
            return ERROR_PASSWORD_SIZE_TO_SHORT;
        }

        if(!checkPasswordHasNumber(password)){
            return ERROR_PASSWORD_REQUIRE_NUMBERS;
        }

        if(!checkPasswordHasLowerAndUppercase(password)) {
            return ERROR_PASSWORD_HAS_NOT_LOWER_AND_UPPERCASE;
        }
        return PASSWORD_IS_SUCCESSFULLY_CREATED;

    }

    private static boolean checkPasswordHasNumber(String password) {
        for (char c : password.toCharArray()) {

            if (!Character.isLetter(c)) // isDigit einfügen..
                return true;
        }
        return false;
    }



    private static boolean checkPasswordHasLowerAndUppercase(String password) {
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if(Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
        }

        return hasLowerCase && hasUpperCase;
    }

}


