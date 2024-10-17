package org.example.unittesting.controllers;

import org.example.unittesting.dtos.CalculatorDto;
import org.example.unittesting.services.CalculatorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class CalculatorController {

    CalculatorService calculator;

    public CalculatorController(CalculatorService calculator) {
        this.calculator = calculator;
    }

    @PostMapping("/add")
    public Double add(@RequestBody CalculatorDto request) {
        return request.getA() + request.getB();
    }

    @PostMapping("/subtract")
    public Double subtract(@RequestBody CalculatorDto request) {
        return calculator.subtract(request.getA(), request.getB());
    }

    @PostMapping("/multiply")
    public Double multiply(@RequestBody CalculatorDto request) {
        return calculator.multiply(request.getA(), request.getB());
    }

    @PostMapping("/divide")
    public Double divide(@RequestBody CalculatorDto request) {
        return calculator.divide(request.getA(), request.getB());
    }

    @PostMapping("/modulus")
    public Double modulus(@RequestBody CalculatorDto request) {
        return calculator.modulus(request.getA(), request.getB());
    }

    @PostMapping("/power")
    public Double power(@RequestBody CalculatorDto request) {
        return calculator.power(request.getA(), request.getB());
    }

    @PostMapping("/square")
    public Double square(@RequestBody CalculatorDto request) {
        return calculator.square(request.getA());
    }

    @PostMapping("/square-root")
    public Double squareRoot(@RequestBody CalculatorDto request) {
        return calculator.squareRoot(request.getA());
    }
}
