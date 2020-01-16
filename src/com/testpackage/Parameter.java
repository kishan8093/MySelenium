package com.testpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parameter {
	
	@Test
	public void Login() throws IOException
	{
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream("D:\\java file\\TestNgProject\\src\\com\\testpackage\\Datadriven.properties");
	
			pro.load(fis);
			
		
			System.out.println(pro.getProperty("username"));
			System.setProperty("webdriver.chrome.driver","C:\\Users\\kisha\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get(pro.getProperty("url"));
		
		
	}
	@Test
	public void LoginTest()
	{
		System.out.println("This is Login Page");
	}

}
