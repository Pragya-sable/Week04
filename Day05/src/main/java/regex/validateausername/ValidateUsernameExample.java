package com.validateausername;

import java.util.regex.*;
// A valid username:
// Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
// Must start with a letter
// Must be between 5 to 15 characters long
public class ValidateUsernameExample {

    public static String isValidate(String username){
        String result;
        // Regular expression pattern
        String regex ="^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

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
