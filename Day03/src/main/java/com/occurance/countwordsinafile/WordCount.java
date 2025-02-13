
package com.occurance.countwordsinafile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
// Program that counts the number of words in a given text file and displays the top 5 most frequently occurring words.
public class WordCount {
    public static void main(String[] args) {

        // HashMap to store word frequency
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Use BufferedReader for efficient file reading
        try (BufferedReader br = new BufferedReader(new FileReader("D:/Capgemini Training/file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into words using a regular expression to handle non-alphanumeric characters
                String[] words = line.split("\\W+");

                // Process each word in the line
                for (String word : words) {
                    if (!word.isEmpty()) {
                        // Convert the word to lowercase to make the word count case-insensitive
                        word = word.toLowerCase();
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Sort the words by frequency in descending order
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
            sortedWords.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());

            // Display the top 5 most frequent words
            System.out.println("Top 5 most frequent words:");
            for (int i = 0; i < Math.min(5, sortedWords.size()); i++) {
                Map.Entry<String, Integer> entry = sortedWords.get(i);
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

