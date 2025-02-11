package com.mapinterface.wordfrequencycounter;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Take input
        String inputText = "Hello world, hello Java! Hello world.";

        // Call the generic method to count word frequencies
        Map<String, Integer> result = Frequency.countFrequency(inputText);

        // Print the word frequency map
        System.out.println(result);
    }
}
