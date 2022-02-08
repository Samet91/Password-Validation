package validator;

import org.junit.jupiter.api.Test;
import de.neuefische.validator.Validator;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void shouldReturnFailMessageIfPasswordIsLessThan10Chars() {
        // given
        String password = "house";
        // when
        String passwordShortFailMessage = Validator.createPassword(password);
        // then
        assertEquals(Validator.ERROR_PASSWORD_SIZE_TO_SHORT, passwordShortFailMessage);
    }

    @Test
    void shouldReturnFailMessageIfPasswordHasNoNumber() {
        // given
        String password = "Goldenlounge";
        // when
        String passwordNoNumberFailMsg = Validator.createPassword(password);
        // then
        assertEquals(Validator.ERROR_PASSWORD_REQUIRE_NUMBERS, passwordNoNumberFailMsg);
    }

    @Test
    void shouldReturnSuccessfullyCreatedMessage() {
        // given
        String password = "Goldenlounge1";
        // when
        String successfullyCreatedMessage = Validator.createPassword(password);
        // then
        assertEquals(Validator.PASSWORD_IS_SUCCESSFULLY_CREATED, successfullyCreatedMessage);
    }

    @Test
    void shouldReturnFailMessageIfPasswordHasNotOneUpperAndLowercase() {
        // given
        String password = "javascriptt1";
        // when
        String passwordHasNotUpperAndLowercaseMessage = Validator.createPassword(password);
        // then
        assertEquals(Validator.ERROR_PASSWORD_HAS_NOT_LOWER_AND_UPPERCASE, passwordHasNotUpperAndLowercaseMessage);
    }

    @Test
    void shouldReturnCorrectMessageIfPasswordsAreCorrect () {
        // given
        String[] passwordArray = new String[3];
        passwordArray[0] = "HelloWorld1";
        passwordArray[1] = "HelloCoaches1";
        passwordArray[2] = "HelloStudents1";
        // when
        String passwordHasNotUpperAndLowercaseMessage = Validator.checkPasswordsHasConditionalsFromValidateMethod(passwordArray);
        // then
        assertEquals(Validator.PASSWORD_IN_ARRAY_ARE_CORRECT, passwordHasNotUpperAndLowercaseMessage);
    }

    @Test
    void shouldReturnFailMessageIfPasswordsAreWrong () {
        // given
        String[] passwordArray = new String[3];
        passwordArray[0] = "HelloWorld";
        passwordArray[1] = "HelloCoaches1";
        passwordArray[2] = "HelloStudents1";
        // when
        String passwordHasNotUpperAndLowercaseMessage = Validator.checkPasswordsHasConditionalsFromValidateMethod(passwordArray);
        // then
        assertEquals(Validator.ERROR_LIST_HAS_WRONG_PASSWORD, passwordHasNotUpperAndLowercaseMessage);
    }

}