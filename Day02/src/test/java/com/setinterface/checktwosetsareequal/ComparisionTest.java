package com.setinterface.checktwosetsareequal;

import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;
public class ComparisionTest {
    @Test
    public void testSetsAreEqual() {
        // Set 1 and Set 2 are equal (same elements, same order)
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(2);
        set2.add(1);

        // Assert sets are equal (order does not matter)
        assertTrue(CompareSet.areSetsEqual(set1, set2));
    }
    @Test
    public void testSetsAreNotEqual() {
        // Set 1 and Set 2 are not equal (different elements)
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(4);
        set2.add(2);
        set2.add(1);

        // Assert sets are not equal
        assertFalse(CompareSet.areSetsEqual(set1, set2));
    }
}
