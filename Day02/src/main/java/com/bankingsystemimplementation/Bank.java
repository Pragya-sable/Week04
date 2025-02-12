package com.bankingsystemimplementation;
import java.util.*;


public class Bank {
    private Map<String, CustomerAccount> accounts;
    private Queue<WithdrawalRequest> withdrawalQueue;

    // Constructor
    public Bank() {
        accounts = new HashMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    // Add a customer account
    public void addAccount(String accountNumber, double balance) {
        if (!accounts.containsKey(accountNumber)) {
            accounts.put(accountNumber, new CustomerAccount(accountNumber, balance));
        } else {
            System.out.println("Account already exists with this number.");
        }
    }

    // Deposit money into a customer account
    public void deposit(String accountNumber, double amount) {
        CustomerAccount account = accounts.get(accountNumber);
        if (account != null && amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Deposited $" + amount + " to account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount or account.");
        }
    }

    // Withdraw money from a customer account
    public boolean requestWithdrawal(String accountNumber, double amount) {
        WithdrawalRequest request = new WithdrawalRequest(accountNumber, amount);
        withdrawalQueue.add(request);
        return processWithdrawal(request);  // Process as soon as the request is made
    }

    // Process withdrawal request
    private boolean processWithdrawal(WithdrawalRequest request) {
        String accountNumber = request.getAccountNumber();
        double amount = request.getAmount();

        CustomerAccount account = accounts.get(accountNumber);
        if (account != null) {
            if (account.withdraw(amount)) {
                System.out.println("Processed withdrawal of $" + amount + " for account " + accountNumber);
                return true;
            } else {
                System.out.println("Insufficient funds for account " + accountNumber);
                return false;
            }
        } else {
            System.out.println("Account " + accountNumber + " not found.");
            return false;
        }
    }

    // Retrieve customer account by account number
    public CustomerAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    // Display customers sorted by balance using TreeMap
    public void displaySortedByBalance() {
        // TreeMap sorts customers by balance in ascending order
        TreeMap<Double, String> sortedAccounts = new TreeMap<>();
        for (Map.Entry<String, CustomerAccount> entry : accounts.entrySet()) {
            sortedAccounts.put(entry.getValue().getBalance(), entry.getKey());
        }

        System.out.println("Customers sorted by balance:");
        for (Map.Entry<Double, String> entry : sortedAccounts.entrySet()) {
            CustomerAccount account = accounts.get(entry.getValue());
            System.out.println(account);
        }
    }

    // Display all customer accounts
    public void displayAllAccounts() {
        System.out.println("All customer accounts:");
        accounts.values().forEach(System.out::println);
    }
}
