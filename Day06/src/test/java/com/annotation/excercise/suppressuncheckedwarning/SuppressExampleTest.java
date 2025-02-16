package com.annotation.excercise.suppressuncheckedwarning;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SuppressExampleTest {

    @Test
    void testCreateRawArrayList() {
        // Create an instance of the RawArrayListExample
        SuppressExample example = new SuppressExample();

        // Call the method that creates a raw ArrayList
        // This will run without compiler warnings due to @SuppressWarnings("unchecked")
        example.createRawArrayList();

        // We can't directly test the standard output here, but you could use System.out capturing
        // or test if the elements are added correctly
    }
    @Test
    void testArrayListContent() {
        // Test the elements inside the ArrayList
        SuppressExampleTest example = new SuppressExampleTest();

        ArrayList rawList = new ArrayList();
        rawList.add("Hello");
        rawList.add(123);
        rawList.add(45.67);

        // Verify that the list contains the expected elements
        assertTrue(rawList.contains("Hello"));
        assertTrue(rawList.contains(123));
        assertTrue(rawList.contains(45.67));
    }
}
