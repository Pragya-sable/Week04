package com.findrepeatingwords;
import java.util.*;
import java.util.regex.*;
public class RepeatingWordsExample {
    public static List<String> findRepeatingWords(String sentence) {
        // Convert the sentence to lowercase to avoid case-sensitive matching
        sentence = sentence.toLowerCase();

        // Regular expression to match words
        String regex = "\\b\\w+\\b";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Matcher to find all words
        Matcher matcher = pattern.matcher(sentence);

        // A map to count the occurrences of each word
        Map<String, Integer> wordCount = new HashMap<>();

        // Find all words and count their occurrences
        while (matcher.find()) {
            String word = matcher.group();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // List to hold repeating words
        List<String> repeatingWords = new ArrayList<>();

        // Check which words occur more than once
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeatingWords.add(entry.getKey());
            }
        }

        return repeatingWords;
    }
}
