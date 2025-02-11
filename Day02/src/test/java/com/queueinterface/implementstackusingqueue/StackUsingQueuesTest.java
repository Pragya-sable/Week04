package com.queueinterface.implementstackusingqueue;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackUsingQueuesTest {

    @Test
    public void testPushPop() {
        StackUsingQueues<Integer> stack = new StackUsingQueues<>();

        // Push elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Test the top element after pushing
        assertEquals(3, stack.top(), "Top element should be 3");

        // Pop the top element and test
        stack.pop();
        assertEquals(2, stack.top(), "Top element should be 2");

        stack.pop();
        assertEquals(1, stack.top(), "Top element should be 1");

        stack.pop();
        assertNull(stack.top(), "Top element should be null when stack is empty");
    }

    @Test
    public void testSize() {
        StackUsingQueues<Integer> stack = new StackUsingQueues<>();

        // Size should be 0 initially
        assertEquals(0, stack.size(), "Stack size should be 0");

        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Size should be 3 after pushing 3 elements
        assertEquals(3, stack.size(), "Stack size should be 3");

        stack.pop();
        // Size should be 2 after popping 1 element
        assertEquals(2, stack.size(), "Stack size should be 2");
    }
}
