package com.OnlineBankingAPI;

public class Client {
	
	public static void main(String[] args) {
	    	
	        Account myAccount = new Account(1000);
	        BankingFacade banking = new BankingFacade(myAccount);

	        // Deposit money
	        banking.deposit(500);
	        System.out.println("Balance after deposit: " + banking.getBalance());

	        // Withdraw money
	        banking.withdraw(200);
	        System.out.println("Balance after withdrawal: " + banking.getBalance());

	        // View transaction history
	        System.out.println("Transaction History:");
	        
	        for (Transaction transaction : banking.getTransactionHistory()) {
	            if (transaction instanceof DepositTransaction) {
	                System.out.println("Deposit: $" + ((DepositTransaction) transaction).getAmount());
	            } 
	            else if (transaction instanceof WithdrawalTransaction) {
	                System.out.println("Withdrawal: $" + ((WithdrawalTransaction) transaction).getAmount());
	            }
	        }
	    }
	}
