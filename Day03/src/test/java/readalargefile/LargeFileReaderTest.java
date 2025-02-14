package readalargefile;
import com.readalargefile.linebyline.LargeFileReader;
import org.junit.jupiter.api.*;

import java.io.*;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;

public class LargeFileReaderTest {
    private static final String TEST_FILE = "test_largefile.txt";

    @BeforeEach
    void setUp() throws Exception {
        Files.write(Paths.get(TEST_FILE),
                ("This is a test line.\n" +
                        "An error occurred in the system.\n" +
                        "Another normal line.\n" +
                        "Critical ERROR found in logs.\n").getBytes());
    }

    @Test
    void testReadLargeFile() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        LargeFileReader.main( new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("error") || output.contains("ERROR"));

    }

    @AfterEach
    void tearDown() throws Exception {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }
}
