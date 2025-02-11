package com.queueinterface.circularbuffersimulation;

public class Main {
    public static void main(String[] args) {
        CircularBuffer<Integer> buffer = new CircularBuffer<>(3);

        // Insert elements into the buffer
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);

        System.out.println("Buffer after inserting 1, 2, 3:");
        buffer.display();

        // Insert another element, which should overwrite the oldest element (1)
        buffer.insert(4);
        System.out.println("Buffer after inserting 4 (overwrites 1):");
        buffer.display();

        // Remove an element from the buffer
        System.out.println("Removed element: " + buffer.remove());

        System.out.println("Buffer after removing one element:");
        buffer.display();

        // Insert another element
        buffer.insert(5);
        System.out.println("Buffer after inserting 5:");
        buffer.display();

        // Peek at the front element
        System.out.println("Peek element: " + buffer.peek());
    }
}
