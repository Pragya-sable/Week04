package com.queueinterface.generatebinarynumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Queue;
import java.util.LinkedList;
public class BinaryTest {
    @Test
    public void testGenerateBinary() {
        // Define the expected result for generating the first 5 binary numbers
        Queue<String> expected = new LinkedList<>();
        expected.add("1");
        expected.add("10");
        expected.add("11");
        expected.add("100");
        expected.add("101");

        // Call the method that generates binary numbers
        Queue<String> actual = Binary.generateBinary(5);

        // Assert that the actual result matches the expected result
        assertEquals(expected, actual);
    }

}
