package com.exceptionpropagation;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionPropagationExampleTest {

    @Test
    public void testExceptionHandledInMain() {
        // Set up a stream to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        // Save the original System.out to restore later
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        try {
            // Call the main method, which should handle the exception
            Main.main(new String[]{});
        } finally {
            // Restore the original System.out
            System.setOut(originalOut);
        }

        // Check if the expected message is in the output
        String output = outputStream.toString().trim();
        assertEquals("Handled exception in main", output, "The exception message was not handled as expected.");
    }
}
