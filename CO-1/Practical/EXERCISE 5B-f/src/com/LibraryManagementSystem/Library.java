package com.LibraryManagementSystem;

import java.util.List;

public interface Library {
    void addBook(Book book);
    void addMember(Member member);
    void borrowBook(String bookTitle, String memberName);
    void returnBook(String bookTitle, String memberName);
    List<Book> getAvailableBooks();
}
