package TestNGDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GoogleDemo {
	public WebDriver driver=null;
	
	/*
	 * @BeforeClass //supporting annotations at the class level public void
	 * invokeBrowser() { driver = new ChromeDriver(); }
	 */
	
	/*
	 * @BeforeMethod //supporting annotations at the class level public void
	 * invokeBrowser() { driver = new ChromeDriver(); }
	 */
	
	@Test
	public void googleSearch() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);	
	}
	
	@Test
	public void amazon() throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);	
	}
	
	@AfterTest
	public void close() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	 
	/*
	 * @AfterMethod //supporting annotations at the class level public void
	 * closeBrowser() { driver.close(); }
	 */

}
