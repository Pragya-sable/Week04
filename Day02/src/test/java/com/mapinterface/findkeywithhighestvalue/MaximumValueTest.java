package com.mapinterface.findkeywithhighestvalue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;
public class MaximumValueTest {

    @Test
    public void testFindKeyWithMaxValue() {
        // Create a sample input map
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        // Find the key with the maximum value
        String result = MaximumValue.findKeyWithMaxValue(inputMap);

        // Assert that the key with the maximum value is "B"
        assertEquals("B", result);
    }

    @Test
    public void testFindKeyWithMaxValueEmptyMap() {
        // Test with an empty map
        Map<String, Integer> inputMap = new HashMap<>();

        // Find the key with the maximum value in an empty map
        String result = MaximumValue.findKeyWithMaxValue(inputMap);

        // Assert that the result is null since the map is empty
        assertNull(result);
    }

    @Test
    public void testFindKeyWithMaxValueSingleElement() {
        // Test with a map containing a single entry
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);

        // Find the key with the maximum value
        String result = MaximumValue.findKeyWithMaxValue(inputMap);

        // Assert that the key with the maximum value is "A"
        assertEquals("A", result);
    }
}
