package com.OnlineBankingAPI;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account(1000);
    }

    @Test
    void testInitialBalance() {
        assertEquals(1000, account.getBalance(), "Initial balance should be 1000");
    }

    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance(), "Balance after deposit should be 1500");
    }

    @Test
    void testWithdraw() {
        account.withdraw(200);
        assertEquals(800, account.getBalance(), "Balance after withdrawal should be 800");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(1200);
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    void testTransactionHistory() {
        account.deposit(500);
        account.withdraw(200);

        assertEquals(2, account.getTransactionHistory().size(), "Transaction history should have 2 entries");
    }
}

