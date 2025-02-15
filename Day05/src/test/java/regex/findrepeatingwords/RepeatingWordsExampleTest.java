package regex.findrepeatingwords;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class RepeatingWordsExampleTest {

    @Test
    public void testFindRepeatingWords() {
        // Test with sentences containing repeating words
        List<String> result = RepeatingWordsExample.findRepeatingWords("This is a test. This is only a test.");
        assertEquals(List.of("this", "is", "a"), result);

        result = RepeatingWordsExample.findRepeatingWords("I love programming. I love solving problems.");
        assertEquals(List.of("i", "love"), result);

        result = RepeatingWordsExample.findRepeatingWords("No repeating words here!");
        assertTrue(result.isEmpty()); // No repeating words

        result = RepeatingWordsExample.findRepeatingWords("Hello hello world world!");
        assertEquals(List.of("hello", "world"), result);

        result = RepeatingWordsExample.findRepeatingWords("One word test test test.");
        assertEquals(List.of("test"), result); // "test" repeats more than once

        result = RepeatingWordsExample.findRepeatingWords("Repeated Repeated Repeated words words!");
        assertEquals(List.of("repeated", "words"), result);

        result = RepeatingWordsExample.findRepeatingWords("Case CASE case sensitive CASE");
        assertEquals(List.of("case"), result); // Test for case insensitivity
    }
}
