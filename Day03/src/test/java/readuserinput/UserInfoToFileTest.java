package readuserinput;
import com.readuserinput.inputfromconsole.Main;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;

class UserInfoToFileTest {
    private static final String TEST_FILE = "test_user_info.txt";

    @BeforeEach
    void setUp() throws IOException {
        // Ensure test file is clean before each test
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testFileWriting() throws IOException {
        String simulatedInput = "John Doe\n25\nPython\n";
        InputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        Main.main(new String[]{});

        System.setIn(System.in);
        System.setOut(originalOut);

        assertTrue(Files.exists(Paths.get("user_info.txt")));
        String fileContent = Files.readString(Paths.get("user_info.txt"));
        assertTrue(fileContent.contains("Name: John Doe"));
        assertTrue(fileContent.contains("Age: 25"));
        assertTrue(fileContent.contains("Favorite Language: Python"));
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }
}