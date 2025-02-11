package com.queueinterface.circularbuffersimulation;
// Program to Implement a circular buffer (fixed-size queue) using an array-based queue.
// When full, overwrite the oldest element
class CircularBuffer<T> {
    private T[] buffer;       // Array to store elements
    private int head;         // Index for the oldest element
    private int tail;         // Index for the next available position
    private int size;         // Current size of the buffer
    private int capacity;     // Maximum capacity of the buffer

    // Constructor to initialize the buffer with a given capacity
    @SuppressWarnings("unchecked")
    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        // Create array with the specified capacity
        buffer = (T[]) new Object[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    // Insert element into the buffer
    public void insert(T element) {
        if (size == capacity) {
            // If buffer is full, overwrite the oldest element
            // Move head to the next element (circular)
            head = (head + 1) % capacity;
        } else {
            size++;
        }
        // Insert element at the tail position
        buffer[tail] = element;
        // Move tail to the next position (circular)
        tail = (tail + 1) % capacity;
    }

    // Remove element from the buffer
    public T remove() {
        if (size == 0) {
            throw new IllegalStateException("Buffer is empty");
        }
        // Get the element at the head position
        T removedElement = buffer[head];
        // Move head to the next element (circular)
        head = (head + 1) % capacity;
        // Decrease the size of the buffer
        size--;

        return removedElement;
    }

    // Get the current size of the buffer
    public int size() {
        return size;
    }

    // Peek at the element at the front of the buffer (without removing it)
    public T peek() {
        if (size == 0) {
            throw new IllegalStateException("Buffer is empty");
        }
        return buffer[head];
    }

    // Display the contents of the buffer
    public void display() {
        if (size == 0) {
            System.out.println("Buffer is empty");
            return;
        }

        int index = head;
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[index] + " ");
            index = (index + 1) % capacity;
        }
        System.out.println();
    }
}