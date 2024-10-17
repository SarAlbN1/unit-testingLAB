package org.example.unittesting;

import org.example.unittesting.services.CalculatorService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTests {

    @Autowired
    private CalculatorService calculator;

    @Test
    void add() {
        // Arrange
        Double a = 1.0;
        Double b = 2.0;
        Double expected = 3.0;

        // Act
        Double actual = calculator.add(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        // Arrange
        Double a = 5.0;
        Double b = 3.0;
        Double expected = 2.0;

        // Act
        Double actual = calculator.subtract(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        // Arrange
        Double a = 2.0;
        Double b = 3.0;
        Double expected = 6.0;

        // Act
        Double actual = calculator.multiply(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void divide() {
        // Arrange
        Double a = 6.0;
        Double b = 2.0;
        Double expected = 3.0;

        // Act
        Double actual = calculator.divide(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void square() {
        // Arrange
        Double a = 4.0;
        Double expected = 16.0;

        // Act
        Double actual = calculator.square(a);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void squareRoot() {
        // Arrange
        Double a = 9.0;
        Double expected = 3.0;

        // Act
        Double actual = calculator.squareRoot(a);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void modulus() {
        // Arrange
        Double a = 7.0;
        Double b = 3.0;
        Double expected = 1.0;

        // Act
        Double actual = calculator.modulus(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void power() {
        // Arrange
        Double a = 2.0;
        Double b = 3.0;
        Double expected = 8.0;

        // Act
        Double actual = calculator.power(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void divideByZero() {
        // Arrange
        Double a = 5.0;
        Double b = 0.0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(a, b));
    }

    @Test
    void negativeSquareRoot() {
        // Arrange
        Double a = -4.0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(a));
    }
}
