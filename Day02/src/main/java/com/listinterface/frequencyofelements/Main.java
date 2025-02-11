package com.listinterface.frequencyofelements;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Sample input list of Strings
        List<String> stringList = List.of("apple", "banana", "apple", "orange");

        // Get the frequency map for the string list
        Map<String, Integer> stringResult = Frequency.countFrequency(stringList);
        System.out.println("String List Frequency: " + stringResult);

        // Sample input list of Integers
        List<Integer> integerList = List.of(1, 2, 2, 3, 3, 3);

        // Get the frequency map for the integer list
        Map<Integer, Integer> integerResult = Frequency.countFrequency(integerList);
        System.out.println("Integer List Frequency: " + integerResult);
    }
}

