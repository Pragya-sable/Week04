package com.findrepeatingwords;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Sample input sentence
        String sentence = "This is is a repeated repeated word test.";

        // Find repeating words
        List<String> repeatingWords = RepeatingWordsExample.findRepeatingWords(sentence);

        // Print the repeating words
        System.out.println(String.join(", ", repeatingWords));
    }
}
