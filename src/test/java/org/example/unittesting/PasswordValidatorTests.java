package org.example.unittesting;

import org.example.unittesting.services.PasswordValidatorService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PasswordValidatorTests {

   @Autowired
    private PasswordValidatorService passwordValidator;

    @Test
    void validPassword() {
        // Arrange
        String password = "Valid@123";
        boolean expected = true;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void passwordWithoutSpecialChar() {
        // Arrange
        String password = "Password123";
        boolean expected = false;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void shortPassword() {
        // Arrange
        String password = "Pass@1";
        boolean expected = false;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void validPasswordWithSpecialChar() {
        // Arrange
        String password = "Pa$$word123!";
        boolean expected = true;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void passwordWithoutMinLength() {
        // Arrange
        String password = "P@ss1";
        boolean expected = false;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void passwordWithSpecialCharAndMinLength() {
        // Arrange
        String password = "ThisIs@Good123";
        boolean expected = true;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void nullPassword() {
        // Arrange
        String password = null;
        boolean expected = false;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void emptyPassword() {
        // Arrange
        String password = "";
        boolean expected = false;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void passwordWithWhitespace() {
        // Arrange
        String password = "Valid@Password 123";
        boolean expected = true;

        // Act
        boolean actual = passwordValidator.validate(password);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
void onlySpecialChars() {
    // Arrange
    String password = "@@@@@@@@"; // Solo caracteres especiales
    boolean expected = false; // Se espera que sea inválida, ya que no cumple con los otros criterios

    // Act
    boolean actual = passwordValidator.validate(password);

    // Assert
    assertEquals(expected, actual); // Se espera que sea false
}
}
