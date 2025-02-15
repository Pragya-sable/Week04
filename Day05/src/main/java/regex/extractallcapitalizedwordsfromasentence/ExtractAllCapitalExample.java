package com.extractallcapitalizedwordsfromasentence;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//  Extract All Capitalized Words from a Sentence

public class ExtractAllCapitalExample {

    public static List<String> extractCapital(String text) {
        List<String> capitalWords = new ArrayList<>();

        // Regular expression capital words
        String regex = "\\b[A-Z][a-zA-Z]*\\b";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Matcher to find all capital words
        Matcher matcher = pattern.matcher(text);

        // Extract all matching capital words
        while (matcher.find()) {
            capitalWords.add(matcher.group());
        }

        return capitalWords;
    }
}
