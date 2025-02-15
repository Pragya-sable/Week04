package com.validateasocialsecuritynumber;

public class Main {
    public static void main(String[] args) {
        // Test inputs
        String ssn1 = "123-45-6789";
        String ssn2 = "123456789";

        // Check if the SSN is valid
        if (SocialSecureValidatorExample.isValidSSN(ssn1)) {
            System.out.println( ssn1 + " is valid");
        } else {
            System.out.println( ssn1 + " is invalid");
        }

        if (SocialSecureValidatorExample.isValidSSN(ssn2)) {
            System.out.println(ssn2 + " is valid");
        } else {
            System.out.println(ssn2 + " is invalid");
        }
    }
}
