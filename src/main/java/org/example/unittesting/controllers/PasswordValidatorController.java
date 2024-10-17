package org.example.unittesting.controllers;

import org.example.unittesting.dtos.PasswordDto;
import org.example.unittesting.services.PasswordValidatorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/password-validator")
@RestController
public class PasswordValidatorController {
    PasswordValidatorService passwordValidatorService;

    public PasswordValidatorController(PasswordValidatorService passwordValidatorService) {
        this.passwordValidatorService = passwordValidatorService;
    }

    @PostMapping("/validate")
    public boolean validate(@RequestBody PasswordDto request) {
        return passwordValidatorService.validate(request.getPassword());
    }
}
