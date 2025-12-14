package com.pipeline;

/**
 * Utility class for validating names.
 * <p>
 * This class provides a static method to check if a name is valid
 * (non-null and contains only alphabetic characters).
 * It cannot be instantiated.
 * </p>
 */
public class NameValidator {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private NameValidator() {
        // Prevent instantiation
    }

    /**
     * Checks if the given name is valid.
     *
     * @param name the name to validate
     * @return {@code true} if the name is non-null and contains only letters,
     *         {@code false} otherwise
     */
    public static boolean isValidName(String name) {
        return name != null && name.matches("[a-zA-Z]+");
    }
}
