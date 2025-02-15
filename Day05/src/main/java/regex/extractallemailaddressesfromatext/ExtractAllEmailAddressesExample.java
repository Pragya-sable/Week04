package com.extractallemailaddressesfromatext;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class ExtractAllEmailAddressesExample {
    public static List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();

        // Regular expression to match email addresses
        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z|a-z]{2,}\\b";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Matcher to find all email addresses
        Matcher matcher = pattern.matcher(text);

        // Extract all matching emails
        while (matcher.find()) {
            emails.add(matcher.group());
        }

        return emails;
    }
}
