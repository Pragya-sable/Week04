package com.mapinterface.findkeywithhighestvalue;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Example input map
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        // Find the key with the maximum value
        String result = MaximumValue.findKeyWithMaxValue(inputMap);

        // Print the result
        System.out.println("Key with the maximum value: " + result);
    }
}
