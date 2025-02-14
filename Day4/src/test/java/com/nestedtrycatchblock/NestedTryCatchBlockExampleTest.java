package com.nestedtrycatchblock;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NestedTryCatchBlockExampleTest {


        @Test
        void testValidIndexAndDivisor() {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            int[] numbers = {10, 20, 30, 40, 50};
            NestedTryCatchBlockExample.divisionOfArray();

            String expectedOutput = "Trying to access index: 2\nTrying to divide 30 by 5\nDivision result: 6\n";
            assertEquals(expectedOutput, outContent.toString());
        }

        @Test
        void testInvalidIndex() {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            int[] numbers = {10, 20, 30, 40, 50};
            NestedTryCatchBlockExample.divisionOfArray();

            assertEquals("Trying to access index: 10\nInvalid array index!\n", outContent.toString());
        }

        @Test
        void testDivisionByZero() {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            int[] numbers = {10, 20, 30, 40, 50};
            NestedTryCatchBlockExample.divisionOfArray();

            assertEquals("Trying to access index: 1\nTrying to divide 20 by 0\nCannot divide by zero!\n", outContent.toString());

    }
}
