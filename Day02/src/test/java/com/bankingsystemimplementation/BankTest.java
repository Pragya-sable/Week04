package com.bankingsystemimplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    private Bank bank;

    // Initialize the Bank object before each test
    @BeforeEach
    public void setUp() {
        bank = new Bank();
        bank.addAccount("A001", 1000.00);
        bank.addAccount("A002", 1500.00);
        bank.addAccount("A003", 500.00);
    }

    // Test to check account addition
    @Test
    public void testAddAccount() {
        bank.addAccount("A004", 1200.00);
        assertNotNull(bank.getAccount("A004"), "Account A004 should exist.");
    }

    // Test to check deposit functionality
    @Test
    public void testDeposit() {
        bank.deposit("A003", 200.00);
        assertEquals(700.00, bank.getAccount("A003").getBalance(), "Balance after deposit should be 700.00.");
    }

    // Test to check successful withdrawal
    @Test
    public void testWithdraw() {
        boolean result = bank.requestWithdrawal("A001", 200.00);
        assertTrue(result, "Withdrawal of 200.00 should be successful.");
        assertEquals(800.00, bank.getAccount("A001").getBalance(), "Balance should be 800.00 after withdrawal.");
    }

    // Test to check withdrawal with insufficient funds
    @Test
    public void testWithdrawInsufficientFunds() {
        boolean result = bank.requestWithdrawal("A003", 600.00);
        assertFalse(result, "Withdrawal of 600.00 should fail due to insufficient funds.");
    }
}
