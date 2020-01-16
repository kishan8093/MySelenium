package com.testpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test
	public void webloginHomepage() {
		System.out.println("This is web login home page");
		
	}
	
	@Test(dataProvider="kishan")
	public void mobileloginHomepage(String username,String password) {
		
		System.out.println("This is mobile login home page");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(groups={"smoke"})
	public void apitestingHomepage() {
		
		System.out.println("This is api testing home page");
	}
	@DataProvider(name="Kishan")
	public Object[][] getdata()
	{
		Object[][] data=new Object[3][2];
		data [0][0]="firstusername";
		data[0][1]="firstpassword";
		data[1][0]="Secondusername";
		data[1][0]="secondpassword";
		data[2][0]="thirdpusername";
		data[2][1]="thirdpassword";
		return data;
	}

}
