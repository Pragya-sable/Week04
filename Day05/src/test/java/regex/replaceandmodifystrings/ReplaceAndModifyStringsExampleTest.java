package regex.replaceandmodifystrings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReplaceAndModifyStringsExampleTest {

    @Test
    public void testReplaceMultipleSpaces() {
        // Test replacing multiple spaces with a single space
        assertEquals("Hello world", ReplaceAndModifyStringsExample.replaceMultipleSpaces("Hello   world"));
        assertEquals("This is a test", ReplaceAndModifyStringsExample.replaceMultipleSpaces("This   is   a   test"));
        assertEquals("A simple test", ReplaceAndModifyStringsExample.replaceMultipleSpaces("A   simple   test"));

    }

    @Test
    public void testEdgeCases() {
        // Test edge cases
        assertEquals("SingleSpace", ReplaceAndModifyStringsExample.replaceMultipleSpaces("SingleSpace"));

    }
}
