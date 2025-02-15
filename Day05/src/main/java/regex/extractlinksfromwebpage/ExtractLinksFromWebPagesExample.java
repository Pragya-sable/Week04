package com.extractlinksfromwebpage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinksFromWebPagesExample {
    public static List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();

        // Regular expression links
        String regex = "https?://[a-zA-Z0-9.-]+(?:/[a-zA-Z0-9&%_./-]*)?";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Matcher to find all links
        Matcher matcher = pattern.matcher(text);

        // Extract all matching links
        while (matcher.find()) {
            links.add(matcher.group());
        }

        return links;
    }
}
