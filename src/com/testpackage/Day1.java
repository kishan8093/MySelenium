package com.testpackage;

import org.testng.annotations.Test;

public class Day1 {
	
	@Test
	public void Demo() {
		System.out.println("Hello");
	}
	@Test(groups= {"smoke"})
	public void second() {
		System.out.println("Second test ");
	}

}
