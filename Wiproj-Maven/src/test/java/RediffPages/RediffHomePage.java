package RediffPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	
	WebDriver driver;
	
	public RediffHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By news = By.linkText("NEWS");
	By sports = By.linkText("SPORTS");
	
	//user defined methods in REdiff Home page
	public WebElement news()
	{
		return driver.findElement(news);
	}
	
	public WebElement sports()
	{
		return driver.findElement(sports);
	}
	
	
	
	
}
