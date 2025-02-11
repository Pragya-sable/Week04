package com.queueinterface.implementstackusingqueue;
import java.util.*;
// Implementation of Stack using queue
class StackUsingQueues<T> {
    // Two queues to simulate the stack
    private Queue<T> q1;
    private Queue<T> q2;

    // Constructor to initialize the two queues
    public StackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push operation: Add element to the stack
    public void push(T x) {
        // Push x to q1
        q1.add(x);
    }

    // Pop operation: Remove the top element from the stack
    public void pop() {
        // If q1 is empty, no operation needed
        if (q1.isEmpty()) {
            return;
        }

        // Move all elements from q1 to q2, except the last one
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // Remove the last element (top element)
        q1.poll();

        // Swap q1 and q2 to continue with the new stack structure
        Queue<T> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Top operation: Get the top element of the stack
    public T top() {
        if (q1.isEmpty()) {
            return null; // Return null if the stack is empty
        }

        // Move all elements from q1 to q2, except the last one
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // Get the last element
        T topElement = q1.peek();

        // Move the last element to q2 and swap the queues
        q2.add(q1.poll());
        Queue<T> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Size operation: Get the size of the stack
    public int size() {
        return q1.size();
    }
}