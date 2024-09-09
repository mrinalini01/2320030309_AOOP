package com.OnlineBankingAPI;

public class WithdrawalTransaction implements Transaction {
    private final Account account;
    private final double amount;

    public WithdrawalTransaction(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }
}