package com.pipeline;

public class NameValidator {

    /**
     * Private constructor to prevent instantiation.
     * This class is a utility class with only static methods.
     */
    private NameValidator() {
        // Prevents instantiation
    }

    /**
     * Validates that a name is not null and contains only letters.
     *
     * @param name the name to validate
     * @return true if valid, false otherwise
     */
    public static boolean isValidName(String name) {
        return name != null && name.matches("[a-zA-Z]+");
    }
}
