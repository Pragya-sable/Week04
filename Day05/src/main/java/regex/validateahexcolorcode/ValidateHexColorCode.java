package com.validateahexcolorcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//  Validate a Hex Color Code
//  A valid hex color:
//  Starts with a #
//  Followed by 6 hexadecimal characters (0-9, A-F, a-f).
public class ValidateHexColorCode {
    public static String isValidate(String username){
        String result;
        // Regular expression pattern
        String regex ="^[#]{1}[0-9A-Za-z]{6}$";

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
