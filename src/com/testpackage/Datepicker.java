package com.testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kisha\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();	
		try {
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(3000);
		List<WebElement> date = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//tr//td"));
		int size = date.size();
		/*for (int i = 0; i < size; i++) {
			String j = date.get(i).getText();
			if (j.contains("31")) {
				date.get(i).click();
			}
		
		}*/
		String text = driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//tr[4]//td[4]")).getText();
		System.out.println(text);
		for(WebElement ele:date)
		{
			
			String strDate=ele.getText();
			System.out.println(strDate);
			if(strDate.contains("12"))
			{
				ele.click();
				break;
			}
		}

	}

}
