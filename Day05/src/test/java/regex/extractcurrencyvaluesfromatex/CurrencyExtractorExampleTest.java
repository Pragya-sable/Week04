package regex.extractcurrencyvaluesfromatex;


import org.junit.jupiter.api.Test;
import regex.extractcurrencyvaluesfromatext.CurrencyExtractorExample;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class CurrencyExtractorExampleTest {

    @Test
    public void testExtractCurrencyValues() {
        // Test case 1: Extract currency values with and without the dollar sign
        String text = "The price is $10.99, and the discount is 5.00.";
        List<String> result = CurrencyExtractorExample.extractCurrencyValues(text);
        assertEquals(List.of("$10.99", "5.00"), result);

        // Test case 2: A sentence with no currency values
        text = "This sentence has no currency values.";
        result = CurrencyExtractorExample.extractCurrencyValues(text);
        assertTrue(result.isEmpty()); // No currency values found

        // Test case 3: A sentence with only integer currency values (no decimals)
        text = "The cost is 50 and the total is $200.";
        result = CurrencyExtractorExample.extractCurrencyValues(text);
        assertEquals(List.of("50", "$200"), result);

        // Test case 4: Currency values with no spaces (adjacent to text)
        text = "Items cost$100 and$200, respectively.";
        result = CurrencyExtractorExample.extractCurrencyValues(text);
        assertEquals(List.of("$100", "$200"), result);

        // Test case 5: A sentence with multiple valid currency values
        text = "The price of the item is $10.25, while another item costs 12.50 and $5.00.";
        result = CurrencyExtractorExample.extractCurrencyValues(text);
        assertEquals(List.of("$10.25", "12.50", "$5.00"), result);
    }
}
