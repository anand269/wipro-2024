package TestNGDemos;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SimpleTest {
	
	private int number;
	@BeforeClass
	public void setup()
	{
		number=5;
	}
	
	@Test //(enabled=false)
	public void testNumberIsPositive()
	{
		Assert.assertTrue(number>0);
		System.out.println("Number: "+number+" is greater than 0");
	}
	
	@Test
	public void compare()
	{
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Test", "hello");
		//sa.assertAll();
		System.out.println("Testing soft assert");
	}
}
