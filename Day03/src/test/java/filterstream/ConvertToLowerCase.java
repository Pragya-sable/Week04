package filterstream;
import com.filterstream.convertuppercasetolowercase.ConvertToLowercase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConvertToLowerCase {
    private static final String INPUT_FILE = "test_input.txt";
    private static final String OUTPUT_FILE = "test_output.txt";

    @BeforeEach
    void setUp() throws Exception {
        Files.write(Paths.get(INPUT_FILE), "HELLO WORLD JAVA PROGRAMMING".getBytes());
    }

    @Test
    void testConversion() throws Exception {
        ConvertToLowercase.main(new String[]{});

        File outputFile = new File(OUTPUT_FILE);
        assertTrue(outputFile.exists());

        String content = new String(Files.readAllBytes(Paths.get(OUTPUT_FILE)));
        assertEquals("hello world java programming", content);
    }

    @AfterEach
    void tearDown() throws Exception {
        Files.deleteIfExists(Paths.get(INPUT_FILE));
        Files.deleteIfExists(Paths.get(OUTPUT_FILE));
    }
}
