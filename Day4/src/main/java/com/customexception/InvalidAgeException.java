package com.customexception;

// Create a custom exception called InvalidAgeException.
public class InvalidAgeException extends Exception{
    // Constructor
    public InvalidAgeException(String message) {
        super(message);
    }
}
