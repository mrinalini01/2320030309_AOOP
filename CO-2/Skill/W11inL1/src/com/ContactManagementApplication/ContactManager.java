package com.ContactManagementApplication;

import java.util.HashMap;
import java.util.Map;

public class ContactManager {
    private Map<String, String> contacts;

    public ContactManager() {
        contacts = new HashMap<>();
    }

    // Method to add a contact
    public void addContact(String name, String phone) {
        contacts.put(name, phone);
    }

    // Method to remove a contact
    public void removeContact(String name) {
        contacts.remove(name);
    }

    // Method to retrieve a contact's phone number
    public String getContact(String name) {
        return contacts.get(name);
    }

    // Method to list all contacts
    public void listAllContacts() {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
}

