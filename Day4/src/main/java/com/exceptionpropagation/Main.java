package com.exceptionpropagation;

public class Main {

        public static void main(String[] args) {
            try {
                // Call method2(), which will propagate the exception from method1()
               ExceptionPropagationExample.method2();
            } catch (ArithmeticException e) {
                // Handle the exception in main() and print the message
                System.out.println("Handled exception in main");
            }
        }

}


