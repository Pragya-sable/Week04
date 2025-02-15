package com.validateasocialsecuritynumber;
import java.util.regex.*;
public class SocialSecureValidatorExample {
    public static boolean isValidSSN(String ssn) {
        // Regular expression for SSN validation
        String regex = "^(\\d{3})-(\\d{2})-(\\d{4})$";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Matcher to check if the SSN matches the pattern
        Matcher matcher = pattern.matcher(ssn);

        // Return true if it matches, false otherwise
        return matcher.matches();
    }
}
