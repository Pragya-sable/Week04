package com.multiplecacatchblock;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultipleCatchBlockExampleTest {

    @Test
    public void testArrayIndexOutOfBoundsException() {
        // Set up the output stream to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Simulate user input for invalid index (e.g., size 3 and index 5)
        String simulatedInput = "3\n1\n2\n3\n5"; // index 5 is out of bounds for array of size 3
        System.setIn(new java.io.ByteArrayInputStream(simulatedInput.getBytes()));

        // Call the method that performs array operations
        MultipleCatchBlockExample.arrayOperation();

        // Check if the exception message is printed correctly
        String output = outputStream.toString();
        assertTrue(output.contains("Invalid index!"));
    }

}