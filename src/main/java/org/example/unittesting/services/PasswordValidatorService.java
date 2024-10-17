package org.example.unittesting.services;

import org.springframework.stereotype.Service;

@Service
public class PasswordValidatorService {
    private static final int MIN_LENGTH = 8;
    private static final String SPECIAL_CHAR_REGEX = ".*[!@#$%^&*(),.?\":{}|<>].*";

    /**
     * Validate password with at least 8 characters and contains at least one special character
     * @param password password to validate
     * @return true if password is valid, false otherwise
     */
    public boolean validate(String password) {
        if (password == null) {
            return false;
        }
        return password.length() >= MIN_LENGTH && password.matches(SPECIAL_CHAR_REGEX);
    }
}
