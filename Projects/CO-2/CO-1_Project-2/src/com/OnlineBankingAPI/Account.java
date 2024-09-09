package com.OnlineBankingAPI;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance;
    private final List<Transaction> transactionHistory;

    public Account(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new DepositTransaction(this, amount));
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.add(new WithdrawalTransaction(this, amount));
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }
}


