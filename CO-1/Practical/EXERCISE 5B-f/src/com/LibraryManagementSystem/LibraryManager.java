package com.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager implements Library {
    private List<Book> books;
    private List<Member> members;

    public LibraryManager() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void addMember(Member member) {
        members.add(member);
    }

    @Override
    public void borrowBook(String bookTitle, String memberName) {
        for (Book book : books) {
            if (book.getTitle().equals(bookTitle) && !book.isBorrowed()) {
                book.borrowBook();
                System.out.println(memberName + " borrowed " + bookTitle);
                return;
            }
        }
        System.out.println("Book not available.");
    }

    @Override
    public void returnBook(String bookTitle, String memberName) {
        for (Book book : books) {
            if (book.getTitle().equals(bookTitle) && book.isBorrowed()) {
                book.returnBook();
                System.out.println(memberName + " returned " + bookTitle);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    @Override
    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (!book.isBorrowed()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
}

