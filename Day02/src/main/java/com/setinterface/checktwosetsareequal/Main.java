package com.setinterface.checktwosetsareequal;
import java.util.Set;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        // Input
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add into set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Add into set2
        set2.add(4);
        set2.add(2);
        set2.add(1);

        boolean result = CompareSet.areSetsEqual(set1, set2);
        System.out.println("Are the sets equal :  " + result);
    }
}
