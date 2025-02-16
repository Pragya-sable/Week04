package com.annotation.practiceproblems.intermediate.maxlength;


public class Main {
    public static void main(String[] args) {
        try {
            User user1 = new User("Pragya"); // Valid case
            System.out.println("Created user: " + user1.getUsername());

            User user2 = new User("LongUsernameExceedsLimit"); // Invalid case
            System.out.println("Created user: " + user2.getUsername());

        } catch (IllegalArgumentException e) {
            System.err.println("Validation Error: " + e.getMessage());
        }
    }
}