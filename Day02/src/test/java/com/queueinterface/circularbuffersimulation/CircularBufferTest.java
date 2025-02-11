package com.queueinterface.circularbuffersimulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CircularBufferTest {

    private CircularBuffer<Integer> buffer;

    @BeforeEach
    void setUp() {
        buffer = new CircularBuffer<>(3); // Create a buffer with capacity 3
    }

    @Test
    void testInsert() {
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);

        assertEquals(3, buffer.size(), "Buffer size should be 3 after inserting 3 elements");
    }

    @Test
    void testOverwriteOldestElement() {
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);

        // Insert an element which should overwrite the oldest element (1)
        buffer.insert(4);
        assertEquals(3, buffer.size(), "Buffer size should still be 3 after inserting 4");

        // Check the front element
        assertEquals(2, buffer.peek(), "The oldest element should be overwritten (1 -> 2)");

        // Remove the element and check the contents
        buffer.remove();
        assertEquals(2, buffer.peek(), "After removing, the new front element should be 2");
    }

    @Test
    void testRemove() {
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);

        // Remove an element
        Integer removedElement = buffer.remove();
        assertEquals(1, removedElement, "The removed element should be 1 (the oldest element)");
        assertEquals(2, buffer.size(), "Buffer size should be 2 after removing an element");
    }

    @Test
    void testPeek() {
        buffer.insert(1);
        buffer.insert(2);

        // Peek at the front element without removing it
        Integer peekElement = buffer.peek();
        assertEquals(1, peekElement, "Peek should return the oldest element without removing it");
    }

    @Test
    void testDisplay() {
        buffer.insert(1);
        buffer.insert(2);

        // Test the display of buffer contents
        buffer.display();
        // The display method itself will print the contents of the buffer
        // You can manually verify the expected output or use a custom assert method if needed
    }
}
