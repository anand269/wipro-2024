package TestNGDemos;
import org.testng.annotations.Test;

public class TestNGDemo1 {
	
	@Test (groups= {"smoke"},priority=2)
	public void TC1()
	{
		System.out.println("My First test case in Test NG");
	}
	
	@Test (groups= {"sanity"},priority=3)
	public void TC2()
	{
		System.out.println("My second test case in Test NG");
	}
	
	@Test (groups= {"regression"},priority=0)
	public void TC3()
	{
		System.out.println("My third test case in Test NG");
	}
	
}
