package com.pipeline;
//import junit testing
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class NameValidatorTest {
    //testing for valid names
    @Test
    void testValidNames() {
        assertTrue(NameValidator.isValidName("Alice"));
        assertTrue(NameValidator.isValidName("Bob"));
    }
    //testing for invaild names
    @Test
    void testInvalidNames() {
        assertFalse(NameValidator.isValidName(""));          // empty string
        assertFalse(NameValidator.isValidName(null));        // null value
    }
}
