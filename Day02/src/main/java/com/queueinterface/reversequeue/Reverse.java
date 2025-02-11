package com.queueinterface.reversequeue;

import java.util.Queue;
// Program to reverse the Queue
public class Reverse {
    // Generic method to reverse the queue
    public static <T> void reverseQueue(Queue<T> queue){
        // Base Case
        if(queue.isEmpty())
            return;
        // Remove the front element
        T front = queue.remove();

        //Recursive call for reverse the remaining queue
        reverseQueue(queue);

        // Add the removed element to rear
        queue.add(front);
    }
}
