package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void shouldReturnFailMessageIfPasswordIsLessThan10Chars() {
        // given
        String password = "haus";
        // when
        String passwordShortFailMessage = Validator.createPassword(password);
        // then
        assertEquals(Validator.ERROR_PASSWORD_SIZE_TO_SHORT, passwordShortFailMessage);
    }

    @Test
    void shouldReturnFailMessageIfPasswordHasNotAtLeastOneNumber() {
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

}