package com.testpackage;

import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void weblogin() {
		System.out.println("This is web login");
		
	}
	
	@Test
	public void mobilelogin() {
		
		System.out.println("This is mobile login");
	}
	
	@Test(groups= {"smoke"})
	public void apitesting() {
		
		System.out.println("This is api trsting");
	}

}
