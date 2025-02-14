package com.banktransactionsystem;

class InsufficientFundsException extends Exception {
    private double amount;
    public InsufficientFundsException(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

