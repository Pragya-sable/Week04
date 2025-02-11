package com.queueinterface.implementstackusingqueue;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        StackUsingQueues<Integer> stack = new StackUsingQueues<>();

        // Push elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Print the top element
        System.out.println("Top element: " + stack.top());

        // Pop elements from the stack
        stack.pop();
        System.out.println("Top element after pop: " + stack.top());

        stack.pop();
        System.out.println("Top element after pop: " + stack.top());

        // Pop the last element
        stack.pop();
        System.out.println("Top element after popping all elements: " + stack.top());

        // Check the size of the stack
        System.out.println("Stack size: " + stack.size());
    }
}
