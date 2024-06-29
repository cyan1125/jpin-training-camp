package com.example.gassyuku;

import java.util.ArrayList;
import java.util.List;

public class ParentBookList {
    List<ParentBook> parentBooks = new ArrayList<>();

    public ParentBookList() {
        ParentBook parentBook = new ParentBook("001", "AreaA", "良いコード・悪いコード", false);
        ParentBook parentBook2 = new ParentBook("002", "AreaA", "リーダブルコード", true);
        parentBooks.add(parentBook);
        parentBooks.add(parentBook2);
    }

    String getArea(String isbn) {
        for (ParentBook parentBook: parentBooks) {
            if (isbn.equals(parentBook.getIsbn())) {
                return parentBook.getArea();
            }
        }
        return "Not Found";
    }

    public void updateStatusToLend(String isbn, String BookId) {
        for (ParentBook parentBook: parentBooks) {
            if (isbn.equals(parentBook.getIsbn())) {
                parentBook.updateStatusToLend(BookId);
            }
        }
    }
    
    public boolean isReservedBook(String isbn) {
        for (ParentBook parentBook: parentBooks) {
            if (isbn.equals(parentBook.getIsbn())) {
                return parentBook.getReservationStatus();
            }
        }
        return false;
    }

    public boolean returnCheck(String isbn, String area) {
        return area.equals(getArea(isbn));
    }

    void retrunBook(String isbn, String area, String bookId) {
        if (isReservedBook(isbn)) {
            System.out.println("予約！あります！");
            return;
        }
        if (returnCheck(isbn, area)) {
            updateStatusToLend(isbn, bookId);
        } 
    }

    void returnResavationBook(String isbn, String bookId) {
        for (ParentBook parentBook: parentBooks) {
            if (isbn.equals(parentBook.getIsbn())) {
                System.out.println("予約ありです。");
                updateStatusToLend(isbn, bookId);
                return;
            }
        }
        System.out.println("予約なしです。");
    }
}
