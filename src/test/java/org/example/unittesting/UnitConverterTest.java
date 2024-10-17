package org.example.unittesting;

import org.example.unittesting.services.UnitConverterService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UnitConverterTest {

    @Autowired
    private UnitConverterService unitConverter = new UnitConverterService();

     @Test
    void celsiusToFahrenheit() {
        // Arrange
        Double celsius = 0.0;
        Double expected = 32.0;

        // Act
        Double actual = unitConverter.celsiusToFahrenheit(celsius);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void fahrenheitToCelsius() {
        // Arrange
        Double fahrenheit = 32.0;
        Double expected = 0.0;

        // Act
        Double actual = unitConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void kilometerToMile() {
        // Arrange
        Double kilometer = 1.0;
        Double expected = 0.621371;

        // Act
        Double actual = unitConverter.kilometerToMile(kilometer);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
void mileToKilometer() {
    // Arrange
    Double mile = 1.0;
    Double expected = 1.609344;

    // Act
    Double actual = unitConverter.mileToKilometer(mile);

    // Assert
    assertEquals(expected, actual, 0.000001); // Tolerancia de 6 decimales
}

    @Test
    void kilogramToPound() {
        // Arrange
        Double kilogram = 1.0;
        Double expected = 2.20462;

        // Act
        Double actual = unitConverter.kilogramToPound(kilogram);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
void poundToKilogram() {
    // Arrange
    Double pound = 1.0;
    Double expected = 0.453593;

    // Act
    Double actual = unitConverter.poundToKilogram(pound);

    // Assert
    assertEquals(expected, actual, 0.000001); // Tolerancia de 6 decimales
}

    @Test
    void negativeCelsiusToFahrenheit() {
        // Arrange
        Double celsius = -40.0;
        Double expected = -40.0;

        // Act
        Double actual = unitConverter.celsiusToFahrenheit(celsius);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void negativeFahrenheitToCelsius() {
        // Arrange
        Double fahrenheit = -40.0;
        Double expected = -40.0;

        // Act
        Double actual = unitConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void zeroKilometerToMile() {
        // Arrange
        Double kilometer = 0.0;
        Double expected = 0.0;

        // Act
        Double actual = unitConverter.kilometerToMile(kilometer);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void zeroMileToKilometer() {
        // Arrange
        Double mile = 0.0;
        Double expected = 0.0;

        // Act
        Double actual = unitConverter.mileToKilometer(mile);

        // Assert
        assertEquals(expected, actual);
    }
}
