package com.queueinterface.reversequeue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Queue;
import java.util.LinkedList;

public class ReverseTest {

    @Test
    public void testReverseQueue() {
        // Test case 1: Reversing a queue with 3 elements
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(10);
        queue1.add(20);
        queue1.add(30);

        Reverse.reverseQueue(queue1);

        // After reversal, the queue should be [30, 20, 10]
        assertEquals(30, queue1.poll());
        assertEquals(20, queue1.poll());
        assertEquals(10, queue1.poll());

        // Test case 2: Reversing an empty queue
        Queue<Integer> queue2 = new LinkedList<>();
        Reverse.reverseQueue(queue2);

        // Empty queue should remain empty
        assertTrue(queue2.isEmpty());

        // Test case 3: Reversing a queue with 1 element
        Queue<Integer> queue3 = new LinkedList<>();
        queue3.add(100);

        Reverse.reverseQueue(queue3);

        // After reversal, the queue should still have the same single element
        assertEquals(100, queue3.poll());
    }
}
