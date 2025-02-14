package com.banktransactionsystem;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("Depositing $50...");
            BankTransactionSystemExample.deposit(50.0);
            System.out.println("New balance: $" + BankTransactionSystemExample.getBalance());

            System.out.println("Withdrawing $200...");
            BankTransactionSystemExample.withdraw(200.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Shortfall: $" + e.getAmount());
        }
    }
}
