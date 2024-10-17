package org.example.unittesting.controllers;

import org.example.unittesting.dtos.UnitConverterDto;
import org.example.unittesting.services.UnitConverterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/unit-converter")
@RestController
public class UnitConverterController {

    UnitConverterService unitConverterService;

    public UnitConverterController(UnitConverterService unitConverterService) {
        this.unitConverterService = unitConverterService;
    }

    @PostMapping("/celsius-to-fahrenheit")
    public Double celsiusToFahrenheit(@RequestBody UnitConverterDto request) {
        return unitConverterService.celsiusToFahrenheit(request.getValue());
    }

    @PostMapping("/fahrenheit-to-celsius")
    public Double fahrenheitToCelsius(@RequestBody UnitConverterDto request) {
        return unitConverterService.fahrenheitToCelsius(request.getValue());
    }

    @PostMapping("/kilometer-to-mile")
    public Double kilometerToMile(@RequestBody UnitConverterDto request) {
        return unitConverterService.kilometerToMile(request.getValue());
    }

    @PostMapping("/mile-to-kilometer")
    public Double mileToKilometer(@RequestBody UnitConverterDto request) {
        return unitConverterService.mileToKilometer(request.getValue());
    }

    @PostMapping("/kilogram-to-pound")
    public Double kilogramToPound(@RequestBody UnitConverterDto request) {
        return unitConverterService.kilogramToPound(request.getValue());
    }
}
