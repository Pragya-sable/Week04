package occurance;

import com.occurance.countwordsinafile.WordCount;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;

class WordCountTest {
    private static final String TEST_FILE = "test_wordcount.txt";


    @BeforeEach
    void setUp() throws Exception {
        // Prepare a test file with predefined content
        String content = "Hello world! Hello everyone.\n" +
                "This is a test file. Hello world.\n" +
                "Java is great. Java is powerful. Java is everywhere.\n";
        Files.write(Paths.get(TEST_FILE), content.getBytes());
    }

    @Test
    void testWordCount() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        WordCount.main(new String[]{});
        String output = outContent.toString();
        System.setOut(originalOut);

        assertTrue(output.contains("Top 5 most frequent words:"));
        assertTrue(output.contains("hello: 3"));
        assertTrue(output.contains("world: 2"));
        assertTrue(output.contains("java: 2"));
        assertTrue(output.contains("is: 2"));
    }

    @AfterEach
    void tearDown() throws Exception {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }
}