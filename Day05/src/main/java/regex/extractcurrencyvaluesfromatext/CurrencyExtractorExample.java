package com.extractcurrencyvaluesfromatext;
import java.util.regex.*;
import java.util.*;
public class CurrencyExtractorExample {
    public static List<String> extractCurrencyValues(String text) {
        List<String> currencyValues = new ArrayList<>();

        // Regular expression to match currency values (with or without dollar sign)
        String regex = "\\$?\\d+(\\.\\d{2})?";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Matcher to find all matches
        Matcher matcher = pattern.matcher(text);

        // Extract all matched currency values
        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        return currencyValues;
    }

}
