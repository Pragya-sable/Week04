package com.finallyblockexexecution;

import com.finallyblockexecution.FinallyBlockExample;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FinallyBlockExampleTest {

    // Test with valid input
    @Test
    public void testValidInput() {
        // Capture the output printed to console
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Simulate valid input: 10 / 2
        FinallyBlockExample.handleException();

        // Check if result and "Operation completed" are printed
        String output = outputStream.toString();
        assertTrue(output.contains("Operation completed"));
    }

    // Test with division by zero (ArithmeticException)
    @Test
    public void testArithmeticException() {
        // Capture the output printed to console
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Simulate division by zero: 10 / 0
        FinallyBlockExample.handleException();

        // Check if exception message and "Operation completed" are printed
        String output = outputStream.toString();
        assertTrue(output.contains("ArithmeticException caught"));
        assertTrue(output.contains("Operation completed"));
    }

    // Test with invalid input (InputMismatchException)
    @Test
    public void testInputMismatchException() {
        // Capture the output printed to console
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Simulate invalid input: abc
        FinallyBlockExample.handleException();

        // Check if exception message and "Operation completed" are printed
        String output = outputStream.toString();
        assertTrue(output.contains("InputMismatchException caught"));
        assertTrue(output.contains("Operation completed"));
    }
}
