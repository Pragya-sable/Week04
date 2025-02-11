package com.listinterface.frequencyofelements;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

// Program for given a list of strings, count the frequency of
// each element and return the results in a Map<String, Integer>
public class Frequency {
    // Generic method for counting the frequency of element in list
    public static <T>Map<T,Integer> countFrequency(List<T> input){
        // Create map for storing the result
        Map<T,Integer> map = new HashMap<>();
        for(T element : input ){
            // Add the key and value int map
            map.put(element,map.getOrDefault(element, 0)+1);
        }
        return map;
    }

}
