package com.mapinterface.wordfrequencycounter;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class FrequencyTest {
    @Test
    public void testCountFrequency() {
        // Input string for the test
        String inputText = "Hello world, hello Java! Hello world.";

        // Call the method to count word frequencies
        Map<String, Integer> result = Frequency.countFrequency(inputText);

        // Expected word frequency map
        Map<String, Integer> expected = Map.of(
                "hello", 3,
                "world", 2,
                "java", 1
        );

        // Verify the result matches the expected map
        assertEquals(expected, result);
    }
}
