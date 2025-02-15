package regex.validateahexcolorcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class HexColorValidatorTest {
    @Test
    public void testValidHexColor() {
        // Test with valid hex color codes
        assertEquals("Valid", ValidateHexColorCode.isValidate("#A1B2C3"));
        assertEquals("Valid", ValidateHexColorCode.isValidate("#abcdef"));
        assertEquals("Valid", ValidateHexColorCode.isValidate("#123456"));
    }

    @Test
    public void testInvalidHexColor() {
        // Test with invalid hex color codes
        assertEquals("Invalid", ValidateHexColorCode.isValidate("#A1B2C3D"));   // Too long
        assertEquals("Invalid", ValidateHexColorCode.isValidate("#12345"));    // Too short
        assertEquals("Invalid", ValidateHexColorCode.isValidate("A1B2C3"));    // Missing '#'

    }
}