package com.mapinterface.invertamap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
public class MapInvertTest {

    @Test
    public void testInvertMap() {
        // Input map
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        // Expected inverted map
        Map<Integer, List<String>> expectedInvertedMap = new HashMap<>();
        expectedInvertedMap.put(1, Arrays.asList("A", "C"));
        expectedInvertedMap.put(2, Collections.singletonList("B"));

        // Invert the map
        Map<Integer, List<String>> invertedMap = MapInverter.invertMap(originalMap);

        // Assert that the inverted map matches the expected result
        assertEquals(expectedInvertedMap, invertedMap);
    }
}
