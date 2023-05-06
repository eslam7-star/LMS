package com.example.project_oop;

public class Reader extends User {

    public Reader(int ID, String Password, String FirstName, String LastName, String Address, String CellPhone, String Email, boolean isBlocked) {
        super(Password, "reader", FirstName, LastName, Address, CellPhone, Email, isBlocked);
    }

    public void searchBooks() {
        // Search for books in the library
    }

    public void searchUsers() {
        // Search for users in the library
    }

    public void addToOrderList(Book book) {
        // Add the reader to the book order list
    }

    public void rentBook(Book book) {
        // Rent a book from the library
    }


}

