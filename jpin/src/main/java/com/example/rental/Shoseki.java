package com.example.rental;

public class Shoseki {
    String  isbn; //isbn
    String name;
    boolean isLendingAvailable; //貸し出し可能な本かどうか
    

    Shoseki (String isbn, boolean isLendingAvailable,String name) {
        this.isbn = isbn;
        this.isLendingAvailable = isLendingAvailable;
        this.name = name;
    }

}
