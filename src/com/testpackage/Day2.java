package com.testpackage;

import org.testng.annotations.Test;

public class Day2 {
	
	@Test
	public void ploan() {
		System.out.println("Ploan Depatment");
	}
	@Test(groups= {"smoke"})
	public void credit()
	{
		System.out.println("Creadit card dep");
	}
}
