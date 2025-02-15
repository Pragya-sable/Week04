package regex.validateausername;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateUsernameExampleTest {

    @Test
    public void testValidUsernames() {
        // Test with valid usernames
        assertEquals("Valid", ValidateUsernameExample.isValidate("user_123"));
        assertEquals("Valid", ValidateUsernameExample.isValidate("username"));
        assertEquals("Valid", ValidateUsernameExample.isValidate("user123"));
        assertEquals("Valid", ValidateUsernameExample.isValidate("user_name"));
        assertEquals("Valid", ValidateUsernameExample.isValidate("a12345"));
        assertEquals("Valid", ValidateUsernameExample.isValidate("user12"));
    }

    @Test
    public void testInvalidUsernames() {
        // Test with invalid usernames
        assertEquals("Invalid", ValidateUsernameExample.isValidate("123username"));  // Starts with a number
        assertEquals("Invalid", ValidateUsernameExample.isValidate("us"));           // Too short (less than 5 characters)
        assertEquals("Invalid", ValidateUsernameExample.isValidate("username_is_too_long"));  // Too long (more than 15 characters)
        assertEquals("Invalid", ValidateUsernameExample.isValidate("user@name"));  // Contains an invalid character (@)
        assertEquals("Invalid", ValidateUsernameExample.isValidate("12345"));      // Starts with a number, too short
        assertEquals("Invalid", ValidateUsernameExample.isValidate("_username"));  // Starts with an underscore
        assertEquals("Invalid", ValidateUsernameExample.isValidate("user!name"));  // Contains an invalid character (!)
        assertEquals("Invalid", ValidateUsernameExample.isValidate("user name")); // Contains a space
    }
}
