package com.extractlinksfromwebpage;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample text
        String text ="Visit https://www.google.com and http://example.org for more info.";


        // Extract capital words from the text
        List<String> links = ExtractLinksFromWebPagesExample.extractLinks(text);

        // Print extracted capital words
        for (String li : links) {
            System.out.println(li);
        }
    }
}
