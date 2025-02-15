package com.extractprogramminglanguagenamesfromatext;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Sample input text
        String text = "I love Java, Python, and JavaScript.";

        // Extract programming language names from the text
        List<String> programmingLanguages = ProgrammingLanguageExtractorExample.extractLanguages(text);

        // Print the extracted languages
        System.out.println(String.join(", ", programmingLanguages));
    }
}
