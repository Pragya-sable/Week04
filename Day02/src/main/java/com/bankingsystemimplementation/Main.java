package com.bankingsystemimplementation;
public class Main {

    public static void main(String[] args) {
        // Create a Bank instance
        Bank bank = new Bank();

        // Add some customer accounts
        bank.addAccount("A001", 1000.00);
        bank.addAccount("A002", 1500.50);
        bank.addAccount("A003", 500.75);
        bank.addAccount("A004", 1200.00);

        // Display all customer accounts
        bank.displayAllAccounts();

        // Deposit some money into accounts
        bank.deposit("A001", 500.00);
        bank.deposit("A003", 200.00);

        // Request withdrawals
        bank.requestWithdrawal("A001", 200.00);
        bank.requestWithdrawal("A002", 1600.00); // Insufficient funds
        bank.requestWithdrawal("A003", 100.00);

        // Display customers sorted by balance
        bank.displaySortedByBalance();
    }
}
