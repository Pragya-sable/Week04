package regex.validatealicenseplate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateLicensePlateExampleTest {

    @Test
    public void testValidLicensePlates() {
        // Test with valid license plate numbers
        assertEquals("Valid", ValidateLicensePlateExample.isValidate("AB1234"));
        assertEquals("Valid", ValidateLicensePlateExample.isValidate("XY9876"));
        assertEquals("Valid", ValidateLicensePlateExample.isValidate("LM4321"));
    }

    @Test
    public void testInvalidLicensePlates() {
        // Test with invalid license plate numbers
        assertEquals("Invalid", ValidateLicensePlateExample.isValidate("A12345"));  // Too many digits
        assertEquals("Invalid", ValidateLicensePlateExample.isValidate("AB123"));   // Too few digits
        assertEquals("Invalid", ValidateLicensePlateExample.isValidate("AB12345")); // Too many digits
        assertEquals("Invalid", ValidateLicensePlateExample.isValidate("abc1234")); // Lowercase letters
        assertEquals("Invalid", ValidateLicensePlateExample.isValidate("1234AB"));  // Digits before letters
        assertEquals("Invalid", ValidateLicensePlateExample.isValidate("AB12"));    // Too few digits
        assertEquals("Invalid", ValidateLicensePlateExample.isValidate("X12345"));  // Only one letter at the start
    }
}
