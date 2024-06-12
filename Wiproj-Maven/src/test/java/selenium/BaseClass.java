package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	static WebDriver driver=null;
	//open browser
		public static void invokeBrowser(String browser)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
			else if(browser.equalsIgnoreCase("Edge"))
			{
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
		}
		//close browser method
		public static void closeBrowser() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.close();//close the current window
		//	driver.quit();//close all the windows opened by selenium
		}

}
