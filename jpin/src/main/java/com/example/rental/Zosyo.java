package com.example.rental;

public class Zosyo {
	
	   String shosekiID;
	   String id; //操作レベルの本ID
	   String status;
	   
	    public String getId() {
	        return id;
	    }

		public Zosyo(String shosekiID, String id, String status) {
			super();
			this.shosekiID = shosekiID;
			this.id = id;
			this.status = status;
		}

	   
	    

}
