package com.extractdates;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDatesExample {
    public static List<String> extractDate(String text) {
        List<String> dates = new ArrayList<>();

        // Regular expression to dates
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Matcher to find all dates
        Matcher matcher = pattern.matcher(text);

        // Extract all matching dates
        while (matcher.find()) {
            dates.add(matcher.group());
        }

        return dates;
    }
}
