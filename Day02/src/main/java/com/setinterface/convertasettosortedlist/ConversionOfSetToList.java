package com.setinterface.convertasettosortedlist;

import java.util.*;

// Program to Convert a HashSet of integers into a sorted list in ascending order
public class ConversionOfSetToList {
    // Method to sort the set
    public static List<Integer> convertSetToList(Set<Integer> set){
        // Conversion of hashset to list
        List<Integer> sortedList = new ArrayList<>(set);

        // Sort the list
        Collections.sort(sortedList);
        return sortedList;
    }
}
