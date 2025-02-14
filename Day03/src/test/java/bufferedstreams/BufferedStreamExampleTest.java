package bufferedstreams;


import com.bufferedstreams.efficientfilecopy.BufferedStreamExample;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedStreamExampleTest {

    private Path inputFile;
    private Path outputFileBuffered;
    private Path outputFileUnBuffered;

    @BeforeEach
    public void setup() {
        // Set the paths to actual files on your system
        inputFile = Paths.get("D:/Capgemini Training/InputTest.txt");  // Change this to your actual input file path
        outputFileBuffered = Paths.get("D:/Capgemini Training/OutputTest.txt");  // Change this to your actual output path for buffered
        outputFileUnBuffered = Paths.get("D:/Capgemini Training/Outputb.txt");  // Change this to your actual output path for unbuffered
    }

    @Test
    public void testCopyFileBuffered() {
        // Copy file using buffered stream
        long duration = BufferedStreamExample.copyFileBuffered();
        System.out.println("Buffered copy duration: " + duration + " ns");

        // Check if the output file exists after copying
        assertTrue(Files.exists(outputFileBuffered), "Buffered output file should exist.");

        // Compare the content of input and buffered copied files
        try {
            String inputContent = Files.readString(inputFile);
            String outputContent = Files.readString(outputFileBuffered);
            assertEquals(inputContent, outputContent, "Content of buffered copied file should match input file.");
        } catch (IOException e) {
            e.printStackTrace();
            fail("Error comparing file content.");
        }
    }

    @Test
    public void testCopyFileUnbuffered() {
        // Copy file using unbuffered stream
        long duration = BufferedStreamExample.copyFileUnbuffered();
        System.out.println("Unbuffered copy duration: " + duration + " ns");

        // Check if the output file exists after copying
        assertTrue(Files.exists(outputFileUnBuffered), "Unbuffered output file should exist.");

        // Compare the content of input and unbuffered copied files
        try {
            String inputContent = Files.readString(inputFile);
            String outputContent = Files.readString(outputFileUnBuffered);
            assertEquals(inputContent, outputContent, "Content of unbuffered copied file should match input file.");
        } catch (IOException e) {
            e.printStackTrace();
            fail("Error comparing file content.");
        }
    }
}
