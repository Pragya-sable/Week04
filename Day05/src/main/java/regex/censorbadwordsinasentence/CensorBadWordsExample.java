package regex.censorbadwordsinasentence;

import java.util.List;

public class CensorBadWordsExample {
    public static String censorWords(String text, List<String> badWords) {
        // Loop through each bad word and replace it with ****
        for (String word : badWords) {
            // Create a word boundary to match the exact word and replace it with "****"
            text = text.replaceAll("\\b" + word + "\\b", "****");
        }
        return text;
    }
}
