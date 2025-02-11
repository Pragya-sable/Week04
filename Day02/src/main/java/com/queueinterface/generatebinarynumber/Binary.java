package com.queueinterface.generatebinarynumber;

import java.util.LinkedList;
import java.util.Queue;
// Program to Generate the first N binary numbers (as strings)
public class Binary {
    // Method to generate the first N binary numbers using a queue
    public static Queue<String> generateBinary(int N){
        Queue<String> result = new LinkedList<>();

        // Initial binary is 1
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        // Generate the binary number
        while(N > 0){
            // Get the first element of the queue
            String binary = queue.remove();

            // Add this element to result
            result.add(binary);

            // Append "0" and "1" to the current binary number and enqueue them
            queue.add(binary + "0");
            queue.add(binary + "1");

            N--;
        }
        return result;
    }
}
