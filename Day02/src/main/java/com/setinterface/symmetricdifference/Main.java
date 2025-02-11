package com.setinterface.symmetricdifference;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Input sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        // Add in set1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        // Add in set2
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Compute the symmetric difference
        Set<Integer> symmetricDifferenceResult = SetOperation.symmetricDifference(set1, set2);
        System.out.println("Symmetric Difference: " + symmetricDifferenceResult);
    }
}

