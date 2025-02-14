package com.banktransactionsystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTransactionSystemExampleTest {

    // Test setup: creates a new BankTransactionSystemExample with an initial balance
    @BeforeEach
    public void setup() {
        // Initialize the BankTransactionSystemExample with a starting balance of $100
        BankTransactionSystemExample bank = new BankTransactionSystemExample(100.0);
    }

    // Test case for depositing money into the account
    @Test
    public void testDeposit() {
        // Initial balance is $100
        BankTransactionSystemExample.deposit(50.0); // Deposit $50
        assertEquals(150.0, BankTransactionSystemExample.getBalance(), "Balance should be $150 after deposit.");
    }

    // Test case for withdrawing money with sufficient funds
    @Test
    public void testWithdrawWithSufficientFunds() throws InsufficientFundsException {
        // Initially $100, after withdrawal of $50, the balance should be $50
        BankTransactionSystemExample.deposit(50.0); // Deposit $50, so balance is $150
        BankTransactionSystemExample.withdraw(50.0); // Withdraw $50
        assertEquals(100.0, BankTransactionSystemExample.getBalance(), "Balance should be $100 after withdrawal.");
    }

    // Test case for withdrawing money with insufficient funds
    @Test
    public void testWithdrawWithInsufficientFunds() {
        // Initially $100, attempting to withdraw $150 will throw InsufficientFundsException
        Exception exception = assertThrows(InsufficientFundsException.class, () -> {
            BankTransactionSystemExample.withdraw(150.0);
        });

        assertEquals("Insufficient funds for withdrawal", exception.getMessage(), "Exception message should match.");
    }
}
