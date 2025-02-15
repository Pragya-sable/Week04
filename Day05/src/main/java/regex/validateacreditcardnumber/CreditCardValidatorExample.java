package com.validateacreditcardnumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardValidatorExample {
    public static boolean isValidCard(String cardNumber) {
        // Regular expression to match Visa or MasterCard (16 digits)
        String regex = "^(4\\d{15}|5\\d{15})$";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Matcher to check if the card number matches the pattern
        Matcher matcher = pattern.matcher(cardNumber);

        // Return true if it matches, false otherwise
        return matcher.matches();
    }
}
