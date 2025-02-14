package com.throworthrows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ThrowOrThrowsExampleTest {

    // Test for valid input and interest calculation
    @Test
    public void testCalculateInterestValidInput() {
        double amount = 1000;
        double rate = 5;
        int years = 2;

        double expectedInterest = 1000 * 5 * 2 / 100;  // Expected interest = 100

        // Call the method and assert the result
        double actualInterest = ThrowOrThrowsExample.calculateInterest(amount, rate, years);
        assertEquals(expectedInterest, actualInterest, "The calculated interest should be 100");
    }

    // Test for invalid input: negative amount
    @Test
    public void testCalculateInterestNegativeAmount() {
        double amount = -1000;  // Negative amount
        double rate = 5;
        int years = 2;

        // Assert that IllegalArgumentException is thrown
        assertThrows(IllegalArgumentException.class, () -> {
            ThrowOrThrowsExample.calculateInterest(amount, rate, years);
        });
    }

    // Test for invalid input: negative rate
    @Test
    public void testCalculateInterestNegativeRate() {
        double amount = 1000;
        double rate = -5;  // Negative rate
        int years = 2;

        // Assert that IllegalArgumentException is thrown
        assertThrows(IllegalArgumentException.class, () -> {
            ThrowOrThrowsExample.calculateInterest(amount, rate, years);
        });
    }
}
