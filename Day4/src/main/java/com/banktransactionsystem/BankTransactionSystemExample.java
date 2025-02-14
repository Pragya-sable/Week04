package com.banktransactionsystem;

public class BankTransactionSystemExample {
    private static double balance;

    public BankTransactionSystemExample(double initialBalance) {
        this.balance = initialBalance;
    }

    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public static void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal", amount - balance);
        }
        balance -= amount;
    }

    public static double getBalance() {
        return balance;
    }



}
