package com.extractdates;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample text
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        // Extract dates from the text
        List<String> dates = ExtractDatesExample.extractDate(text);

        // Print extracted dates
        for (String str : dates) {
            System.out.println(str);
        }
    }
}
