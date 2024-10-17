package org.example.unittesting.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;

@Service
public class UnitConverterService {

    private static final int DECIMAL_PLACES = 6;

    private Double round(Double value) {
        if (value == null) {
            return null;
        }
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(DECIMAL_PLACES, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    /**
     * Convert celsius to fahrenheit
     * @param celsius temperature in celsius
     * @return temperature in fahrenheit
     */
    public Double celsiusToFahrenheit(Double celsius) {
        return round((celsius * 9 / 5) + 32);
    }

    /**
     * Convert fahrenheit to celsius
     * @param fahrenheit temperature in fahrenheit
     * @return temperature in celsius
     */
    public Double fahrenheitToCelsius(Double fahrenheit) {
        return round((fahrenheit - 32) * 5 / 9);
    }

    /**
     * Convert kilometer to mile
     * @param kilometer distance in kilometer
     * @return distance in mile
     */
    public Double kilometerToMile(Double kilometer) {
        return round(kilometer * 0.621371);
    }

    /**
     * Convert mile to kilometer
     * @param mile distance in mile
     * @return distance in kilometer
     */
    public Double mileToKilometer(Double mile) {
        return round(mile / 0.621371);
    }

    /**
     * Convert kilogram to pound
     * @param kilogram weight in kilogram
     * @return weight in pound
     */
    public Double kilogramToPound(Double kilogram) {
        return round(kilogram * 2.20462);
    }

    /**
     * Convert pound to kilogram
     * @param pound weight in pound
     * @return weight in kilogram
     */
    public Double poundToKilogram(Double pound) {
        return round(pound / 2.20462);
    }
}
