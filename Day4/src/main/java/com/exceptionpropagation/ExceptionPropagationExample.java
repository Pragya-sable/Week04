package com.exceptionpropagation;

// Java program with three methods:
// method1(): Throws an ArithmeticException (10 / 0).
// method2(): Calls method1().
// main(): Calls method2() and handles the exception.
public class ExceptionPropagationExample {
    // method1() throws an ArithmeticException (divide by zero)
    public static void method1() {
        int result = 10 / 0;  // This will throw ArithmeticException
    }

    // method2() calls method1(), which propagates the exception
    public static void method2() {
        method1();  // Calls method1(), which throws ArithmeticException
    }
}
