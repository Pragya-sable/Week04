package com.mapinterface.mergetwomap;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // Create two maps with example values
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Merge the two maps
        Map<String, Integer> result = MergeTwoMap.mergeMaps(map1, map2);

        // Print the merged map
        System.out.println(result);
    }
}
