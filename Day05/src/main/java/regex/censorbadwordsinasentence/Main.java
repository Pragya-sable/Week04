package regex.censorbadwordsinasentence;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample input sentence
        String input = "This is a damn bad example with some stupid words.";

        // List of bad words to censor
        List<String> badWords = Arrays.asList("damn", "stupid");

        // Censor the bad words
        String output = CensorBadWordsExample.censorWords(input, badWords);

        // Print the output
        System.out.println(output);
    }
}
