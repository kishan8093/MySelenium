import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datapro {
	@DataProvider
	public Object[][] getdata() 
	{
		Object[][] data=new Object[4][2];
		data[0][0]="Kishan";
		data[0][1]="Lal";
		data[1][0]="Tuna";
		data[1][1]="sahu";
		data[2][0]="basanta";
		data[2][1]="maha";
		data[3][0]="admin";
		data[3][1]="admin";
		return data;
	}
	@Test(dataProvider="getdata")
	public void login(String username,String Password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kisha\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(10000);
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(Password);
		driver.findElement(By.name("Submit")).click();
		driver.close();
		
	}
}
