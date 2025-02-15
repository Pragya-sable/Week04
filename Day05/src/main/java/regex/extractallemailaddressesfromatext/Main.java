package com.extractallemailaddressesfromatext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample text
        String text = "pragya2628@gmail.com and pragyasable2628@gmail.com";

        // Extract emails from the text
        List<String> emailAddresses = ExtractAllEmailAddressesExample.extractEmails(text);

        // Print extracted emails
        for (String email : emailAddresses) {
            System.out.println(email);
        }
    }
}
