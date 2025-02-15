package com.extractcurrencyvaluesfromatext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample input text
        String text = "The price is $45.99, and the discount is 10.50.";

        // Extract currency values from the text
        List<String> currencyValues = CurrencyExtractorExample.extractCurrencyValues(text);

        // Print the extracted currency values
        System.out.println(String.join(", ", currencyValues));
    }
}
