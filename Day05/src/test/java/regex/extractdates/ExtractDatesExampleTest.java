package regex.extractdates;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ExtractDatesExampleTest {

    @Test
    public void testExtractDate() {
        // Test case 1: Extracting dates from a sentence with multiple dates
        String text = "The event is on 12/31/2025 and the deadline is 01/15/2025.";
        List<String> result = ExtractDatesExample.extractDate(text);
        assertEquals(List.of("12/31/2025", "01/15/2025"), result);

        // Test case 2: A sentence with no dates
        text = "There are no dates here.";
        result = ExtractDatesExample.extractDate(text);
        assertTrue(result.isEmpty()); // No dates found

        // Test case 3: A sentence with a single valid date
        text = "The meeting is scheduled for 03/25/2023.";
        result = ExtractDatesExample.extractDate(text);
        assertEquals(List.of("03/25/2023"), result);

        // Test case 4: A sentence with invalid date formats (e.g., 3/25/2023 or 12/25/23)
        text = "Incorrect date format: 3/25/2023 and 12/25/23";
        result = ExtractDatesExample.extractDate(text);
        assertTrue(result.isEmpty()); // Invalid formats should not match

        // Test case 5: A sentence with multiple valid dates and mixed formats
        text = "The event is on 05/12/2023, and the registration ends by 08/01/2024.";
        result = ExtractDatesExample.extractDate(text);
        assertEquals(List.of("05/12/2023", "08/01/2024"), result);
    }
}
