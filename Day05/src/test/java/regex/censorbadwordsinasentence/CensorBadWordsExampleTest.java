package regex.censorbadwordsinasentence;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;

public class CensorBadWordsExampleTest {

    @Test
    public void testCensorWords() {
        // Test case : Censoring a list of bad words
        List<String> badWords = Arrays.asList("bad", "evil", "horrible");
        String text = "This is a bad day, evil thoughts, and a horrible situation!";
        String result = CensorBadWordsExample.censorWords(text, badWords);
        assertEquals("This is a **** day, **** thoughts, and a **** situation!", result);


        // Test case : Censoring words with punctuation
        badWords = Arrays.asList("bad", "evil");
        text = "This is a bad day, evil thoughts!";
        result = CensorBadWordsExample.censorWords(text, badWords);
        assertEquals("This is a **** day, **** thoughts!", result);
    }
}
