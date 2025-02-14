package com.customexception;

public class CustomExceptionExample {
   // Method validateAge(int age) that throws InvalidAgeException if the age is below 18
    public static void validateAge(int age)throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Age must be older than 18");
        }
        else {
            System.out.println("Access Granted");
        }
    }
}
