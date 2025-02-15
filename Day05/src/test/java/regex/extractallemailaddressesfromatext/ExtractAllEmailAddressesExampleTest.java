package regex.extractallemailaddressesfromatext;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ExtractAllEmailAddressesExampleTest {

    @Test
    public void testExtractEmails() {
        // Test case 1: Extracting multiple email addresses from a text
        String text = "You can contact me at john.doe@example.com or jane_doe123@another-domain.org.";
        List<String> result = ExtractAllEmailAddressesExample.extractEmails(text);
        assertEquals(List.of("john.doe@example.com", "jane_doe123@another-domain.org"), result);

        // Test case 2: No email addresses in the text
        text = "This text does not contain any emails.";
        result = ExtractAllEmailAddressesExample.extractEmails(text);
        assertTrue(result.isEmpty()); // No email addresses found

        // Test case 3: A text with an email in a valid format
        text = "My email is contact@company.com.";
        result = ExtractAllEmailAddressesExample.extractEmails(text);
        assertEquals(List.of("contact@company.com"), result);

        // Test case 4: A text with an invalid email (missing domain or TLD)
        text = "Invalid emails: user@domain, user@domain.";
        result = ExtractAllEmailAddressesExample.extractEmails(text);
        assertTrue(result.isEmpty()); // Invalid emails should not match

        // Test case 5: Multiple emails with a mix of valid and invalid formats
        text = "Valid emails: valid.email@domain.com, invalid.email@domain, correct.email@website.org.";
        result = ExtractAllEmailAddressesExample.extractEmails(text);
        assertEquals(List.of("valid.email@domain.com", "correct.email@website.org"), result);
    }
}
