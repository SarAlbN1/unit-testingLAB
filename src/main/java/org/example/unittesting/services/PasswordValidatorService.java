package org.example.unittesting.services;

import org.springframework.stereotype.Service;

@Service
public class PasswordValidatorService {
    private static final int MIN_LENGTH = 8;
    private static final String SPECIAL_CHAR_REGEX = ".*[!@#$%^&*(),.?\":{}|<>].*";
    private static final String ALPHA_NUMERIC_REGEX = ".*[A-Za-z0-9].*";

    /**
     * Validate password with at least 8 characters, contains at least one special character,
     * and contains at least one alphanumeric character.
     * @param password password to validate
     * @return true if password is valid, false otherwise
     */
    public boolean validate(String password) {
        if (password == null) {
            return false;
        }

        // Validate length
        if (password.length() < MIN_LENGTH) {
            return false;
        }

        // Validate it contains at least one special character
        if (!password.matches(SPECIAL_CHAR_REGEX)) {
            return false;
        }

        // Validate it contains at least one alphanumeric character
        if (!password.matches(ALPHA_NUMERIC_REGEX)) {
            return false;
        }

        return true;
    }
}
