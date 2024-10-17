package org.example.unittesting.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private static final int DECIMAL_PLACES = 6;

    private Double round(Double value) {
        if (value == null) {
            return null;
        }
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(DECIMAL_PLACES, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public Double add(Double a, Double b) {
        return round(a + b);
    }

    public Double subtract(Double a, Double b) {
        return round(a - b);
    }

    public Double multiply(Double a, Double b) {
        return round(a * b);
    }

    public Double divide(Double a, Double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return round(a / b);
    }

    public Double square(Double a) {
        return round(a * a);
    }

    public Double squareRoot(Double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate the square root of a negative number");
        }
        return round(Math.sqrt(a));
    }

    public Double modulus(Double a, Double b) {
        return round(a % b);
    }

    public Double power(Double a, Double b) {
        return round(Math.pow(a, b));
    }
}
