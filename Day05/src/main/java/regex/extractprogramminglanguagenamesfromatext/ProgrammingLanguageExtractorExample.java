package com.extractprogramminglanguagenamesfromatext;
import java.util.regex.*;
import java.util.*;
public class ProgrammingLanguageExtractorExample {
    public static List<String> extractLanguages(String text) {
        List<String> languages = new ArrayList<>();

        // Regular expression to match programming languages
        String regex = "\\b(?:Java|Python|JavaScript|C#|C|C++)\\b";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Matcher to find all matches
        Matcher matcher = pattern.matcher(text);

        // Extract all matched programming languages
        while (matcher.find()) {
            languages.add(matcher.group());
        }

        return languages;
    }
}
