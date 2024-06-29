package com.example.gassyuku;

public class Main {

    static ParentBookList parentBookList;

    public static void main(String[] args) {
        System.out.println("返却開始");
        parentBookList = new ParentBookList();
        // 本のバーコードから読み取った情報
        String isbn = "002";
        String bookId = "1";
        //端末の情報
        String area = "AreaA";

        // String apiKbn = "retrun";
        String apiKbn = "resavation";

        if ("retrun".equals(apiKbn)) {
            parentBookList.retrunBook(isbn, area, bookId);
        } else if ("resavation".equals(apiKbn)) {
            parentBookList.returnResavationBook(isbn, bookId);
        } else {
            System.out.println("Error");
        }

        
        
        
    }


    
}
