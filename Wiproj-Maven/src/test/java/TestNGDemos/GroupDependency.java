package TestNGDemos;

import org.testng.annotations.Test;

public class GroupDependency{
	
	@Test (dependsOnGroups = {"SignIn"})
	public void viewAcc()
	{
		System.out.println("View your A/c Dashboard");
	}
	
	@Test (groups= {"SignIn"},priority=0)
	public void openBrowser()
	{
		System.out.println("Browser opened successfully");
	}
	
	@Test (groups= {"SignIn"},priority=1)
	public void logIn()
	{
		System.out.println("Login to the Account");
	}

}
