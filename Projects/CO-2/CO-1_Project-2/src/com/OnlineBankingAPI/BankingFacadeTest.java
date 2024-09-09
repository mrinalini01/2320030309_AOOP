package com.OnlineBankingAPI;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankingFacadeTest {

    private BankingFacade bankingFacade;

    @BeforeEach
    void setUp() {
        Account account = new Account(1000);
        bankingFacade = new BankingFacade(account);
    }

    @Test
    void testGetBalance() {
        assertEquals(1000, bankingFacade.getBalance(), "Initial balance should be 1000");
    }

    @Test
    void testDeposit() {
        bankingFacade.deposit(500);
        assertEquals(1500, bankingFacade.getBalance(), "Balance after deposit should be 1500");
    }

    @Test
    void testWithdraw() {
        bankingFacade.withdraw(200);
        assertEquals(800, bankingFacade.getBalance(), "Balance after withdrawal should be 800");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bankingFacade.withdraw(1200);
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    void testTransactionHistory() {
        bankingFacade.deposit(500);
        bankingFacade.withdraw(200);

        assertEquals(2, bankingFacade.getTransactionHistory().size(), "Transaction history should have 2 entries");
    }
}

