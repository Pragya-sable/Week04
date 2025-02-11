package com.setinterface.unionandintersectionofset;
import java.util.*;
// Program to compute Union and Intersection of Two Sets
public class Computation {
    // Generic method for computation of union of two set
    public static <T> Set<T> unionOfSets(Set<T> set1, Set<T> set2){
        // Create set and start with set1 elements
        Set<T> set = new HashSet<>(set1);
        // Add all elements of set2
        set.addAll(set2);
        return set;
    }

    // Generic method for computation of intersection of two set
    public static <T> Set<T> intersectionOfSets(Set<T> set1, Set<T> set2){
        // Create set and start with set1 elements
        Set<T> set = new HashSet<>(set1);
        // Keep only those element which is prent in both set(retainAll())
        set.retainAll(set2);
        return set;
    }

}
