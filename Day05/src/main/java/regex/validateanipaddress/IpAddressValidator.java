package com.validateanipaddress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddressValidator {
    public static boolean isValidIP(String ipAddress) {
        // Regular expression to match a valid IPv4 address
        String regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Matcher to check if the IP address matches the pattern
        Matcher matcher = pattern.matcher(ipAddress);

        // Return true if it matches, false otherwise
        return matcher.matches();
    }
}
