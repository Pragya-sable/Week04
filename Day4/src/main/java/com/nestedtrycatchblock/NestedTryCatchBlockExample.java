package com.nestedtrycatchblock;

import java.util.Scanner;

// Write a Java program that:
// Takes an array and a divisor as input.
// Tries to access an element at an index.
// Tries to divide that element by the divisor.
// Uses nested try-catch to handle:
// ArrayIndexOutOfBoundsException if the index is invalid.
// ArithmeticException if the divisor is zero.
public class NestedTryCatchBlockExample {
    public static void divisionOfArray() {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Accept an array and a divisor as input from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the index to access: ");
        int index = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
        try {
            // Try to access the array element
            try {
                int element = array[index];  // Accessing array element
                // Try to divide the element by the divisor
                try {
                    int result = element / divisor;  // Dividing the element by divisor
                    System.out.println("Result of division: " + result);
                } catch (ArithmeticException e) {
                    // Handle division by zero
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle invalid array index
                System.out.println("Invalid array index!");
            }
        } catch (Exception e) {
            // Handle any unexpected exceptions
            System.out.println("An unexpected error occurred.");
        }
    }
}
