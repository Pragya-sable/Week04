package com.mapinterface.mergetwomap;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTwoMapTest {
    @Test
    public void testMergeMaps() {
        // Creating the first map
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        // Creating the second map
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Merging the two maps
        Map<String, Integer> mergedMap = MergeTwoMap.mergeMaps(map1, map2);

        // Expected merged map
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("A", 1);
        expectedMap.put("B", 5);  // B is merged as 2 + 3 = 5
        expectedMap.put("C", 4);

        // Verify the result is as expected
        assertEquals(expectedMap, mergedMap);
    }

}
