package com.mapinterface.invertamap;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // input map
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        // Invert the map
        Map<Integer, List<String>> invertedMap = MapInverter.invertMap(originalMap);

        // Print the inverted map
        System.out.println(invertedMap);
    }
}
