package com.validatealicenseplate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Validate a License Plate Number
// License plate format: Starts with two uppercase letters, followed by four digits.
// Example: "AB1234" is valid, but "A12345" is invalid.
public class ValidateLicensePlateExample {
    public static String isValidate(String username){
        String result;
        // Regular expression pattern
        String regex ="^[A-Z]{2}\\d{4}$";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Match the username to the pattern
        Matcher matcher = pattern.matcher(username);

        // If it matches then return valid
        if(matcher.find()){
            result = "Valid";
        }
        // return invalid
        else {
            result = "Invalid";
        }

        return result;
    }

}
