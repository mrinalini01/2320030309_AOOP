package com.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();

        // Add books
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("1984", "George Orwell"));

        // Add members
        library.addMember(new Member("Alice"));
        library.addMember(new Member("Bob"));

        // Borrow and return books
        library.borrowBook("1984", "Alice");
        library.returnBook("1984", "Alice");

        // List available books
        for (Book book : library.getAvailableBooks()) {
            System.out.println(book);
        }
    }
}
