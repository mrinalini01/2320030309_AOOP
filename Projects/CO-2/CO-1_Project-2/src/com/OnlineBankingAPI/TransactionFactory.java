package com.OnlineBankingAPI;

//TransactionFactory.java
public class TransactionFactory {
	
	public static Transaction createTransaction(String type, Account account, double amount) {
		switch (type) {
        	case "DEPOSIT":
        		return new DepositTransaction(account, amount);
        	case "WITHDRAWAL":
        		return new WithdrawalTransaction(account, amount);
        	default:
        		throw new IllegalArgumentException("Unknown transaction type");
		}
	}
}
