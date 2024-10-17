package org.example.unittesting.services;

import org.springframework.stereotype.Service;

@Service

public class CalculatorService {

    public Double add(Double a, Double b) {
        return a + b;
    }

    public Double subtract(Double a, Double b) {
        return a - b;
    }

    public Double multiply(Double a, Double b) {
        return a * b;
    }

    public Double divide(Double a, Double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public Double square(Double a) {
        return a * a;
    }

    public Double squareRoot(Double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate the square root of a negative number");
        }
        return Math.sqrt(a);
    }

    public Double modulus(Double a, Double b) {
        return a % b;
    }

    public Double power(Double a, Double b) {
        return Math.pow(a, b);
    }
}
