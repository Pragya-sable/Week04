package regex.extractlinksfromwebpage;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ExtractLinksFromWebPagesExampleTest {

    @Test
    public void testExtractLinks() {
        // Test case : A sentence with a few valid URLs
        String text = "Check out our website at https://example.com and http://mywebsite.org!";
        List<String> result = ExtractLinksFromWebPagesExample.extractLinks(text);
        assertEquals(List.of("https://example.com", "http://mywebsite.org"), result);

        // Test case : A sentence with no URLs
        text = "This sentence contains no links.";
        result = ExtractLinksFromWebPagesExample.extractLinks(text);
        assertTrue(result.isEmpty()); // No links found
    }
}
