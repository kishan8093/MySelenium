package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="nilambar";
		data[0][1]="nil@123";
		data[1][0]="Kishan";
		data[1][1]="kishan123";
		data[2][0]="kisan123";
		data[2][1]="kishan";
		return data;
	}

	
	@Test(dataProvider="getdata")
	public void login(String username,String Password)
	{
		System.out.println("username is :" +username);
		System.out.println("password is :" +Password);
	}
	
}


