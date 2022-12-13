package com.TestNG.Hotelbook1;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Baseclass.NewCode.All_methods;
import com.hotel.NewCode.Dataexcel;

public class Login_Page extends All_methods {
	String url="http://adactinhotelapp.com/";
	
	@BeforeSuite
	public void browserLaunch() {
		launch();
	}
	
	@Test(priority = 0)
	public void getUrl() {
		geturl(url);
		waits();
	}
	
	@Test(priority = 1)
	@Parameters({"username","password"})
	public void loginPage(String name,String password) throws IOException {
//		List<String> data = Dataexcel.excelData();
		idwithSendkeys("username", name);
		idwithSendkeys("password", password);
	}
	
	@Test(priority = 2)
	public void logIn() {
		idwithClick("login");
	}
	
}
