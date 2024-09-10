package com.ContactManagementApplication;

public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        // Add several contacts
        manager.addContact("Alice", "1234567890");
        manager.addContact("Bob", "0987654321");
        manager.addContact("Charlie", "5555555555");

        // Retrieve and display a contact's phone number
        System.out.println("Bob's phone number: " + manager.getContact("Bob"));

        // Remove a contact
        manager.removeContact("Alice");

        // List all contacts
        System.out.println("\nAll contacts:");
        manager.listAllContacts();
    }
}

