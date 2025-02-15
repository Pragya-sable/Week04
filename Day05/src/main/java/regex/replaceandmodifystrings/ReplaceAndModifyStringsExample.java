package com.replaceandmodifystrings;

public class ReplaceAndModifyStringsExample {
    public static String replaceMultipleSpaces(String text) {
        // Replace multiple spaces with a single space
        return text.replaceAll("\\s+", " ");
    }

}
