package com.mapinterface.mergetwomap;
import java.util.*;
// Program to Merge two Map
public class MergeTwoMap {
    // Method to merge two maps
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        // Loop through each entry in map2
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            // If map1 contains the key, add the values;
            // otherwise, add the key-value pair from map2
            if (map1.containsKey(entry.getKey())) {
                // If key exists in map1,
                // sum the values
                map1.put(entry.getKey(), map1.get(entry.getKey()) + entry.getValue());
            } else {
                // If key does not exist in map1,
                // just add the key-value pair from map2
                map1.put(entry.getKey(), entry.getValue());
            }
        }
        return map1;
    }
}
