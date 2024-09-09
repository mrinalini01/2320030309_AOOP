package com.OnlineBankingAPI;

import java.util.List;

public class BankingFacade {
 private final Account account;

 public BankingFacade(Account account) {
     this.account = account;
 }

 public double getBalance() {
     return account.getBalance();
 }

 public void deposit(double amount) {
     account.deposit(amount);
 }

 public void withdraw(double amount) {
     account.withdraw(amount);
 }

 public List<Transaction> getTransactionHistory() {
     return account.getTransactionHistory();
 }
}


