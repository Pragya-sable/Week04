package regex.validateacreditcardnumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CreditCardValidatorExampleTest {

    @Test
    public void testValidVisaCards() {
        // Test with valid Visa cards
        assertTrue(CreditCardValidatorExample.isValidCard("4111111111111111"));
        assertTrue(CreditCardValidatorExample.isValidCard("4234567890123456"));
        assertTrue(CreditCardValidatorExample.isValidCard("4112345678901234"));
    }

    @Test
    public void testValidMasterCardCards() {
        // Test with valid MasterCard cards
        assertTrue(CreditCardValidatorExample.isValidCard("5100000000000000"));
        assertTrue(CreditCardValidatorExample.isValidCard("5234567890123456"));
        assertTrue(CreditCardValidatorExample.isValidCard("5300000000000000"));
    }

    @Test
    public void testInvalidCardNumbers() {
        // Test with invalid card numbers
        assertFalse(CreditCardValidatorExample.isValidCard("1234567890123456"));  // Does not start with 4 or 5
        assertFalse(CreditCardValidatorExample.isValidCard("6111111111111111"));  // Starts with 6, not Visa or MasterCard
        assertFalse(CreditCardValidatorExample.isValidCard("42345678901234"));   // Too short, only 15 digits
        assertFalse(CreditCardValidatorExample.isValidCard("41111111111111111")); // Too long, 17 digits
        assertFalse(CreditCardValidatorExample.isValidCard("123456789012345"));   // Invalid length and starting number
        assertFalse(CreditCardValidatorExample.isValidCard("411111111111111"));   // Invalid length, only 15 digits
    }
}
