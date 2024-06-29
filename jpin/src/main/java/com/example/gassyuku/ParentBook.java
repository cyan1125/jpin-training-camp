package com.example.gassyuku;

import java.util.ArrayList;
import java.util.List;

public class ParentBook {
    String isbn;
    String area;
    String name;
    boolean reservationStatus;
    List<Book> books = new ArrayList<>();
    public ParentBook(String isbn, String area, String name, boolean reservationStatus) {
        this.isbn = isbn;
        this.area = area;
        this.name = name;
        this.reservationStatus = reservationStatus;
        // this.books = new ArrayList<Book>();
        Book book1 = new Book("001","1", "貸出中");
        books.add(book1);
        System.out.println(books.get(0).getId());

    }

    public void add(Book book) {
        this.books.add(book);
    }

    public String getIsbn() {
        return isbn;
    }

    public String getArea() {
        return area;
    }

    public boolean getReservationStatus() {
        return reservationStatus;
    }

    public void updateStatusToLend(String bookId) {
        for (Book book:books) {
            if (bookId.equals(book.getId())) {
                book.updateStatusToLend();
            }
        }
    }
}
