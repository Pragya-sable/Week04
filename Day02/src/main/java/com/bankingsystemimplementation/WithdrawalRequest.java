package com.bankingsystemimplementation;
public class WithdrawalRequest {
    private String accountNumber;
    private double amount;

    // Constructor
    public WithdrawalRequest(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
