package com.replaceandmodifystrings;

public class Main {
    public static void main(String[] args) {
        // Sample input
        String input = "This   is   an  example    with  multiple  spaces.";

        // Replace multiple spaces with a single space
        String output = ReplaceAndModifyStringsExample.replaceMultipleSpaces(input);

        // Print the output
        System.out.println(output);
    }
}
