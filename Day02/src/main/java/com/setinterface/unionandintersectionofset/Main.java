package com.setinterface.unionandintersectionofset;
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

        // Compute the union
        Set<Integer> unionResult = Computation.unionOfSets(set1, set2);
        System.out.println("Union: " + unionResult);

        // Compute the intersection
        Set<Integer> intersectionResult = Computation.intersectionOfSets(set1, set2);
        System.out.println("Intersection: " + intersectionResult);
    }
}

