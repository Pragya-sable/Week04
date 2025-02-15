package com.extractallcapitalizedwordsfromasentence;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample text
        String text ="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Extract capital words from the text
        List<String> capitalWords = ExtractAllCapitalExample.extractCapital(text);

        // Print extracted capital words
        for (String capital : capitalWords) {
            System.out.println(capital);
        }
    }
}
