package com.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;
// Java program that asks the user to enter two numbers and divides them.
// Handle possible exceptions
public class UncheckedExceptionExample {

    // Method for division
    public static int division(int num1, int num2){
      return num1 / num2;
    }

    // Method to handle the exception
    public static void handleException(){
        Scanner scanner =new Scanner(System.in);
        try {
            // If the user enters 0 as the denominator,
            // catch and handle ArithmeticException
            // If the user enters a non-numeric value,
            // catch and handle InputMismatchException.

            System.out.println("Enter First Number : ");
            int num1 = scanner.nextInt();

            System.out.println("Enter Second Number : ");
            int num2 = scanner.nextInt();

            int result = division(num1,num2);
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("InputMismatchException  caught: "+ e.getMessage());
        }finally {

            scanner.close();
        }
    }
}
