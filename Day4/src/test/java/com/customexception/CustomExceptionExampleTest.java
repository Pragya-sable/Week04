package com.customexception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomExceptionExampleTest {

    // Test to validate age throws InvalidAgeException if age is below 18
    @Test
    void testValidateAge_InvalidAge() {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            CustomExceptionExample.validateAge(17); // Age below 18, should throw exception
        });

        assertEquals("Age must be older than 18", exception.getMessage(), "Exception message should match");
    }

    // Test to validate age does not throw exception if age is 18 or older
    @Test
    void testValidateAge_ValidAge() {
        // No exception should be thrown
        try {
            CustomExceptionExample.validateAge(18);
        } catch (InvalidAgeException e) {
            fail("Exception should not be thrown for valid age.");
        }
    }
}
