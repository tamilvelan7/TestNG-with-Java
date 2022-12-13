package com.TestNG.Hotelbook1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.Baseclass.NewCode.All_methods;

public class Search_Hotel extends All_methods {
	
	@Test
	public void searchHotelPage() {
		dropDownofIndexusingId("location", 8);
		dropDownofIndexusingId("hotels", 2);
		dropDownofIndexusingId("room_type", 4);
		dropDownofIndexusingId("room_nos", 3);
		dropDownofIndexusingId("adult_room", 3);
		dropDownofIndexusingId("child_room", 2);
	}
	
	@Test(dependsOnMethods = "searchHotelPage")
	public void dateSelect() {
		idwithSendkey("datepick_in", "26/09/2022"); 
		idwithSendkey("datepick_out", "29/09/2022");
		xpathwithClick("//input[@name='Submit']");

	}
	
	@Test(dependsOnMethods = "dateSelect")
	public void selectHotel() {
		idwithClick("radiobutton_0");
		idwithClick("continue");
	}

}
