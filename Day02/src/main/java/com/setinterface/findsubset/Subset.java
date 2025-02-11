package com.setinterface.findsubset;

import java.util.Set;
// Program to Check if one set is a subset of another.
public class Subset {
    // Method to check one set is subset of another or not
    public static <T> boolean isSubset(Set<T> set1 , Set <T> set2){
        return set1.containsAll(set2) || set2.containsAll(set1);
    }
}
