package regex.extractallcapitalizedwordsfromasentence;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ExtractAllCapitalExampleTest {

    @Test
    public void testExtractCapitalWords() {
        // Test case 1: Extracting capitalized words from a sentence
        String text = "John and Mary went to the Market.";
        List<String> result = ExtractAllCapitalExample.extractCapital(text);
        assertEquals(List.of("John", "Mary", "Market"), result);

        // Test case 2: No capitalized words in the sentence
        text = "this is a test sentence.";
        result = ExtractAllCapitalExample.extractCapital(text);
        assertTrue(result.isEmpty()); // No capitalized words found

        // Test case 3: A sentence with only capitalized words
        text = "The Quick Brown Fox.";
        result = ExtractAllCapitalExample.extractCapital(text);
        assertEquals(List.of("The", "Quick", "Brown", "Fox"), result);

        // Test case 4: Mixed case words with some capitalized
        text = "Alice and Bob went to the Cafe.";
        result = ExtractAllCapitalExample.extractCapital(text);
        assertEquals(List.of("Alice", "Bob", "Cafe"), result);

        // Test case 5: Sentence with numbers and capitalized words
        text = "John and 1234 Mary saw the Movie in 2023.";
        result = ExtractAllCapitalExample.extractCapital(text);
        assertEquals(List.of("John", "Mary", "Movie"), result);
    }
}
