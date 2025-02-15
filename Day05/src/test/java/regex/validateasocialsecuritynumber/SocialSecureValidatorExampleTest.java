package regex.validateasocialsecuritynumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SocialSecureValidatorExampleTest {

    @Test
    public void testValidSSNs() {
        // Test with valid SSNs
        assertTrue(SocialSecureValidatorExample.isValidSSN("123-45-6789"));
        assertTrue(SocialSecureValidatorExample.isValidSSN("987-65-4321"));
        assertTrue(SocialSecureValidatorExample.isValidSSN("001-23-4567"));
        assertTrue(SocialSecureValidatorExample.isValidSSN("555-12-3456"));
    }

    @Test
    public void testInvalidSSNs() {
        // Test with invalid SSNs
        assertFalse(SocialSecureValidatorExample.isValidSSN("123-456-789"));    // Missing hyphens
        assertFalse(SocialSecureValidatorExample.isValidSSN("12-345-6789"));    // Too few digits at the start
        assertFalse(SocialSecureValidatorExample.isValidSSN("123-45-678"));     // Too few digits at the end
        assertFalse(SocialSecureValidatorExample.isValidSSN("1234-56-7890"));   // Too many digits at the start
        assertFalse(SocialSecureValidatorExample.isValidSSN("123-45-67890"));   // Too many digits at the end
        assertFalse(SocialSecureValidatorExample.isValidSSN("abc-45-6789"));    // Non-numeric characters at the start
        assertFalse(SocialSecureValidatorExample.isValidSSN("123-45-xyz1"));    // Non-numeric characters at the end
        assertFalse(SocialSecureValidatorExample.isValidSSN("123-45-6789 "));   // Trailing space
        assertFalse(SocialSecureValidatorExample.isValidSSN(" 123-45-6789"));   // Leading space
        assertFalse(SocialSecureValidatorExample.isValidSSN("123456789"));      // Missing hyphens
    }
}
