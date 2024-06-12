package TestNGDemos;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatProviderDemo {
	
	@DataProvider(name="loginData")
	public Object[][] provideData()
	{
		return new Object[][]
				{
					{"user4", "password4"},
					{"user2", "password2"},
					{"user3", "password3"},
					{"user1", "password1"},
				};
	}
	
	@Test(dataProvider = "loginData")
	public void testLogin(String username,String password)
	{
		System.out.println("UserName: "+username);
		System.out.println("Password: "+password);
		//add your logic
	}

}
