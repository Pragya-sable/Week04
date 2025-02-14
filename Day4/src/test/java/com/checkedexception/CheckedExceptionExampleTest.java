package com.checkedexception;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CheckedExceptionExampleTest {

    @Test
    void testReadFile_FileExists() throws IOException {
        // Create a temporary file with some content
        String filePath = "testfile.txt";
        String content = "Hello this is Pragya.";

        // Write content to the file
        Files.write(Paths.get(filePath), content.getBytes());

        // Create an instance of CheckedExceptionExample and call the readFile method
        CheckedExceptionExample.readFile();

        //Clean up by deleting the file after test
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }
    }
}



