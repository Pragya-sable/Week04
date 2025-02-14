package com.throworthrows;
public class ThrowOrThrowsExample {

   // Create a method calculateInterest
    public static double calculateInterest(double amount, double rate, int years)throws IllegalArgumentException{
        if(amount < 0 || rate < 0){
            throw new IllegalArgumentException("Amount and rate must be positive");
        }

        // Calculate the interest
        double interest = amount * rate * years / 100;
        return interest;
    }
}
