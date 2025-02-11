package com.setinterface.findsubset;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Example sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        // Add into set1
        set1.add(2);
        set1.add(3);
        // Add into set2
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Check if either set1 is a subset of set2 or set2 is a subset of set1
        boolean result = Subset.isSubset(set1, set2);
        System.out.println("Is Subset : " + result);
    }
}
