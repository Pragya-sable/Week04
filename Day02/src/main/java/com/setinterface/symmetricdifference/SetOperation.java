package com.setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;
// Program to compute Symmetric Difference
public class SetOperation {
    // Generic Method to find Symmetric Difference
    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2){
        // Create two set and start with copy of set1
        Set<T> union = new HashSet<>(set1);
        Set<T> intersection = new HashSet<>(set1);
        // Union of set1 and set2
        union.addAll(set2);

        // Intersection of set1 and set2
        intersection.retainAll(set2);

        // Symmetric difference = Union - Intersection
        union.removeAll(intersection);
        return union;
    }
}
