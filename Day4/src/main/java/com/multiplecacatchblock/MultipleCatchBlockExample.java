package com.multiplecacatchblock;

import java.util.Scanner;
//  Program that performs array operations
public class MultipleCatchBlockExample {

    public static void arrayOperation() {
        // Create instance of Scanner
        Scanner scanner = new Scanner(System.in);

        try{
            // Enter the size of array
            System.out.println("Enter the size of array");
            int size = scanner.nextInt();

            // Create a new array
            int arr[] = new int[size];

            // Take input
            for(int i = 0; i < size; i++){
                System.out.println("Enter the array element ");
                arr[i] = scanner.nextInt();
            }

            // Enter the index
            System.out.println("Enter the index of array");
            int index = scanner.nextInt();

            // Print
            System.out.println("Value at index " +index+ ":" + arr[index]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }catch (NullPointerException e){
            System.out.println("Array is not initialized!");
        }finally {
            // Close the scanner object to avoid memory leaks
            scanner.close();
        }

    }
}
