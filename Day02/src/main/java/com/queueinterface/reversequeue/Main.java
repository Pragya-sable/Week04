package com.queueinterface.reversequeue;
import java.util.Queue;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        // Create a Queue and add some elements
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Print original queue
        System.out.println("Original Queue: " + queue);

        // Reverse the queue
        Reverse.reverseQueue(queue);

        // Print the reversed queue
        System.out.println("Reversed Queue: " + queue);
    }

}
