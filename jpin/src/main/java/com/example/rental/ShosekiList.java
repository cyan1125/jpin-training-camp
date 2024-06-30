package com.example.rental;

import java.util.ArrayList;
import java.util.List;

public class ShosekiList {
	 List<Shoseki> ShosekiList = new ArrayList<>();

	    public ShosekiList() {
	        Shoseki Shoseki1 = new Shoseki("001",   false,"良いコード・悪いコード");
	        Shoseki Shoseki2 = new Shoseki("002",  true,"リーダブルコード");
	        ShosekiList.add(Shoseki1);
	        ShosekiList.add(Shoseki2);
	    }

}
