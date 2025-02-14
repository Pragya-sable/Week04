package datastream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    private static final String TEST_FILE = "test_students.dat";

    @BeforeEach
    void setUp() throws Exception {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(TEST_FILE))) {
            dos.writeInt(201);
            dos.writeUTF("Charlie");
            dos.writeDouble(7.8);
        }
    }

    @Test
    void testReadStudentData() throws Exception {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(TEST_FILE))) {
            assertEquals(201, dis.readInt());
            assertEquals("Charlie", dis.readUTF());
            assertEquals(7.8, dis.readDouble(), 0.01);
        }
    }

    @AfterEach
    void tearDown() throws Exception {
        Files.deleteIfExists(new File(TEST_FILE).toPath());
    }
}
