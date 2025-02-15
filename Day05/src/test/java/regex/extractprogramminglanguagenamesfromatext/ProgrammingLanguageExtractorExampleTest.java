package regex.extractprogramminglanguagenamesfromatext;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ProgrammingLanguageExtractorExampleTest {

    @Test
    public void testExtractLanguages() {
        // Test extracting programming languages from text
        String text = "I am learning Java and Python. JavaScript is also fun!";
        List<String> result = ProgrammingLanguageExtractorExample.extractLanguages(text);
        assertEquals(List.of("Java", "Python", "JavaScript"), result);

    }
}
