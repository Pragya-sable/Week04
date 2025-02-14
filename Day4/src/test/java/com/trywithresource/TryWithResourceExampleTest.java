package com.trywithresource;
import org.junit.jupiter.api.Test;

import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class TryWithResourceExampleTest {

    // Test case for reading the first line from a file
    @Test
    public void testReadFile() throws IOException {
        // Create a temporary file for testing
        File tempFile = File.createTempFile("testFile", ".txt");

        // Write some content to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Hello, this is the first line.");
            writer.newLine();
            writer.write("This is the second line.");
        }

        // Set the file path to the temp file
        String filePath = tempFile.getAbsolutePath();

        // Capture the output printed to System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);  // Redirect output to capture it

        // Run the method to test
        TryWithResourceTest.readFile();

        // Check if the first line is printed correctly
        String output = outputStream.toString();
        assertTrue(output.contains("First Line : Hello, this is the first line"));

        // Clean up: delete the temporary file after the test
        tempFile.delete();
    }

    // Test case for empty file
    @Test
    public void testEmptyFile() throws IOException {
        // Create a temporary empty file for testing
        File tempFile = File.createTempFile("testEmptyFile", ".txt");

        // Set the file path to the temp file
        String filePath = tempFile.getAbsolutePath();

        // Capture the output printed to System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);  // Redirect output to capture it

        // Run the method to test
        TryWithResourceTest.readFile();

        // Check if "File is empty" message is printed correctly
        String output = outputStream.toString();
        assertTrue(output.contains("File is empty"));

        // Clean up: delete the temporary file after the test
        tempFile.delete();
    }

    // Test case for non-existent file
    @Test
    public void testFileNotFound() {
        // Set a path for a file that doesn't exist
        String filePath = "non_existent_file.txt";

        // Capture the output printed to System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);  // Redirect output to capture it

        // Run the method to test
        TryWithResourceTest.readFile();

        // Check if "Error reading file" message is printed correctly
        String output = outputStream.toString();
        assertTrue(output.contains("Error reading file"));
    }
}