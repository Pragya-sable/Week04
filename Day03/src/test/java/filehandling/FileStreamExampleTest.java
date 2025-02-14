package filehandling;
import com.filehandling.readandwriteatextfile.FileStreamExample;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileStreamExampleTest {

    private static final String sourceFile = "D:/Capgemini Training/InputTest.txt";
    private static final String destinationFile = "D:/Capgemini Training/OutputTest.txt";

    @BeforeEach
    void setUp() throws IOException {
        // Create a small test file
        Files.writeString(Paths.get(sourceFile), "Hello, this is a test file.");
    }

    @Test
    void testFileCopy() {
        // Ensure FileCopy class has a valid method to call
        FileStreamExample.main(new String[]{}); // Run main method

        // Validate that the destination file is created
        assertTrue(Files.exists(Paths.get(destinationFile)));

        // Validate file content matches source
        try {
            assertEquals(Files.readString(Paths.get(sourceFile)), Files.readString(Paths.get(destinationFile)));
        } catch (IOException e) {
            fail("Error reading files: " + e.getMessage());
        }
    }
}
