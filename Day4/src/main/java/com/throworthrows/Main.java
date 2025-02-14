package com.throworthrows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            // Take the input
            System.out.println("Enter amount : ");
            double amount = scanner.nextDouble();

            System.out.println("Enter rate : ");
            double rate = scanner.nextDouble();

            System.out.println("Enter year : ");
            int year = scanner.nextInt();

            // Call the method
            double interest = ThrowOrThrowsExample.calculateInterest(amount,rate,year);
            System.out.println("Interest is : " +interest);
        }catch (IllegalArgumentException e){
           System.out.println("Amount and rate must be positive");
       }
    }
}
