package com.mapinterface.invertamap;
import java.util.*;
public class MapInverter {
    // Method to invert the map
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> originalMap) {
        // Create a new map
        Map<V, List<K>> invertedMap = new HashMap<>();

        // Iterate through each entry in the original map
        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            // The computeIfAbsent method is used to either fetch the existing list of keys
            // for a value or create a new list if it doesn't already exist
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return invertedMap;
    }
}
