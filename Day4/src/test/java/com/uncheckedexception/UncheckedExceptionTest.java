package com.uncheckedexception;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class UncheckedExceptionTest {

    @Test
    public void testDivisionByZero() throws IOException {
        // Simulate user input for division by zero
        String userInput = "10\n0\n";  // First number: 10, Second number: 0

        // Capture the output printed to System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);  // Redirect output to capture it

        // Simulate user input using System.setIn
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        // Run the method to test
        UncheckedExceptionExample.handleException();

        // Verify the correct exception message was printed
        String output = outputStream.toString();
        assertTrue(output.contains("ArithmeticException caught"));
    }

    @Test
    public void testInvalidInput() throws IOException {
        // Simulate user input with invalid (non-integer) input
        String userInput = "ten\n5\n";  // First number: "ten" (invalid), Second number: 5

        // Capture the output printed to System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);  // Redirect output to capture it

        // Simulate user input using System.setIn
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        // Run the method to test
        UncheckedExceptionExample.handleException();

        // Verify the correct exception message was printed
        String output = outputStream.toString();
        assertTrue(output.contains("InputMismatchException  caught"));
    }

    @Test
    public void testValidDivision() throws IOException {
        // Simulate valid user input
        String userInput = "10\n2\n";  // First number: 10, Second number: 2

        // Capture the output printed to System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);  // Redirect output to capture it

        // Simulate user input using System.setIn
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        // Run the method to test
        UncheckedExceptionExample.handleException();

        // Verify the correct result was printed
        String output = outputStream.toString();
        assertTrue(output.contains("5"));  // The expected result of 10 / 2
    }
}