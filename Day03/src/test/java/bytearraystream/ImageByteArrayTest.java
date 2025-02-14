package bytearraystream;

import com.bytearraystream.convertimagetobytearray.ImageByteArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class ImageByteArrayTest {
    private static final String TEST_IMAGE = "test_image.jpg";
    private static final String OUTPUT_IMAGE = "test_copy.jpg";

    @BeforeEach
    void setUp() throws Exception {
        // Create a dummy test image (100 KB of random bytes)
        byte[] dummyData = new byte[1024 * 100];
        Files.write(Paths.get(TEST_IMAGE), dummyData);
    }

    @Test
    void testImageConversion() throws Exception {
        byte[] imageBytes = ImageByteArray.imageToByteArray(TEST_IMAGE);
        assertNotNull(imageBytes);
        assertTrue(imageBytes.length > 0);

        ImageByteArray.byteArrayToImage(imageBytes, OUTPUT_IMAGE);
        File outputFile = new File(OUTPUT_IMAGE);
        assertTrue(outputFile.exists());
        assertEquals(Files.size(Paths.get(TEST_IMAGE)), Files.size(Paths.get(OUTPUT_IMAGE)));
    }

    @AfterEach
    void tearDown() throws Exception {
        Files.deleteIfExists(Paths.get(TEST_IMAGE));
        Files.deleteIfExists(Paths.get(OUTPUT_IMAGE));
    }
}
