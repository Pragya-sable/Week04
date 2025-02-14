package com.customexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner Object
        Scanner scanner =new Scanner(System.in);
        try{
            // Take Input
            System.out.println("Enter age : ");
            int age = scanner.nextInt();

            // Call the validateAge()
            CustomExceptionExample.validateAge(age);
        }catch(InvalidAgeException e){
            System.out.println("Age must be older than 18");
        }
    }
}
