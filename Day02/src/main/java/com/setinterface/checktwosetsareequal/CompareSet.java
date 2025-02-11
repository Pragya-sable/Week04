package com.setinterface.checktwosetsareequal;
import java.util.Set;
// Program to compare two sets and determine if they contain the same elements, regardless of order
public class CompareSet {
    // Method to check if twp set equal or not
    public static <T> boolean areSetsEqual(Set<T>set1, Set<T>set2){
        return set1.equals(set2);
    }
}
