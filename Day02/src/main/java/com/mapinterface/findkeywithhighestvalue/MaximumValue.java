package com.mapinterface.findkeywithhighestvalue;

import java.util.Map;
// Program to Find the Key with the Highest Value
public class MaximumValue {
    // Method to find the key with the maximum value
    public static String findKeyWithMaxValue(Map<String, Integer> map){
        // Initialize variable
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        // Iterate through the map to find the key with the maximum value
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
