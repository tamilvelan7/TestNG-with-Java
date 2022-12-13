package com.TestNG.Hotelbook1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;
import org.testng.annotations.Test;

import com.Baseclass.NewCode.All_methods;
import com.hotel.NewCode.Dataexcel;

public class Book_Hotel extends All_methods{
	
	@Parameters({"first_name","last_name","address","cc_num","cvv"})
	@Test
	public void customerDetailPage(String name, String last, String address, String num,String cvv) throws IOException {
//		List<String> data = Dataexcel.excelData();
		idwithSendkeys("first_name", name);
		idwithSendkeys("last_name", last);
		idwithSendkeys("address", address);
		idwithSendkeys("cc_num", num);
		idwithSendkeys("cc_cvv", cvv);
	}
		
	@Test(dependsOnMethods="customerDetailPage")
	public void cardDetail() { 	
		dropDownofIndexusingXpath("//select[@name='cc_type']", 3);
		dropDownofValueusingXpath("//select[@id='cc_exp_month']", "12");
		dropDownoftextusingXpath("(//select)[3]", "2022");
	}

	@Test(priority=1)
	public void bookHotel() {
		idwithClick("book_now");
	}

}
