package com.example.gassyuku;

public class Book {
    String ParentID;
    String id;
    public String getId() {
        return id;
    }

    String status;

    Book (String parentID,String id, String status) {
        this.ParentID = parentID;
        this.id = id;
        this.status = status;
        
    }
    
    public void updateStatusToLend() {
        this.status = "返却済み";
        System.out.println("返却済みになりましたよ");
    }
    
}
