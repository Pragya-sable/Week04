package com.setinterface.findsubset;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
public class SubsetTest {
    @Test
    public void testIsSubset() {
        // Example 1: Set1 is a subset of Set2
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        // Test if Set1 is a subset of Set2
        boolean result = Subset.isSubset(set1, set2);
        assertTrue(result, "Set1 should be a subset of Set2");

        // Example 2: Set2 is a subset of Set1
        Set<Integer> set3 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set4 = new HashSet<>(Arrays.asList(2, 3));

        // Test if Set2 is a subset of Set1
        result = Subset.isSubset(set3, set4);
        assertTrue(result, "Set2 should be a subset of Set1");

        // Example 3: Neither set is a subset of the other
        Set<Integer> set5 = new HashSet<>(Arrays.asList(5, 6));
        Set<Integer> set6 = new HashSet<>(Arrays.asList(1, 2, 3));

        // Test if Set5 is a subset of Set6 or vice versa
        result = Subset.isSubset(set5, set6);
        assertFalse(result, "Neither Set5 nor Set6 should be a subset of each other");
    }
}
