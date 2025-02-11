package com.mapinterface.wordfrequencycounter;

import java.util.HashMap;
import java.util.*;

public class Frequency {
    // Generic method for counting the frequency of element in list
    public static <T> Map<T, Integer> countFrequency(String input) {
        // Create map for storing the result
        Map<T, Integer> map = new HashMap<>();

        // Convert the input text to lowercase for case-insensitivity
        input = input.toLowerCase();

        // Split the input text into words by spaces
        String[] words = input.split("[^a-zA-Z]+");

        // Iterate over each word and update the frequency in the map
        for (String word : words) {
            if (!word.isEmpty()) {
                T key = (T) word;
                map.put(key, map.getOrDefault(key, 0) + 1);
            }

        }
        return map;
    }
}
