package de.neuefische;

public class Validator {

    public static String ERROR_PASSWORD_SIZE_TO_SHORT = "failed to set password. Minimum size is 9";
    public static String ERROR_PASSWORD_REQUIRE_NUMBERS = "failed to set password. At least 1 Numbers required.";
    public static String PASSWORD_IS_SUCCESSFULLY_CREATED = "Password is successfully created";

    public static String createPassword(String password) {
        return checkPasswordLength(password);
    }

    private static String checkPasswordLength(String password) {
        if (password.length() < 10) {
            return ERROR_PASSWORD_SIZE_TO_SHORT;
        }

        if(!checkPasswordHasNumber(password)){
            return ERROR_PASSWORD_REQUIRE_NUMBERS;
        }

        return PASSWORD_IS_SUCCESSFULLY_CREATED;

    }

    private static boolean checkPasswordHasNumber(String password) {
        for (char c : password.toCharArray()) {
            if (!Character.isLetter(c))
                return true;
        }
        return false;
    }

}


