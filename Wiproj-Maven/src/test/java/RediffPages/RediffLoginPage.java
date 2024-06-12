package RediffPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	WebDriver driver;
	public RediffLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	//username, password, sign-in and home page link
	By userName = By.name("login");
	By password = By.id("password");
	By signIn = By.cssSelector("input[title='Sign in']");
	By rediffHome = By.linkText("rediff.com");


	//user defined method - username
	public WebElement userName()
	{
		//driver.findElement(By.name("login"));
		return driver.findElement(userName);
	}

	//user defined method - password
	public WebElement password()
	{			
		return driver.findElement(password);
	}

	//user defined method - sing in
	public WebElement signIn()
	{			
		return driver.findElement(signIn);
	}

	//user defined method - Home page link
	public WebElement rediffHome()
	{			
		return driver.findElement(rediffHome);
	}

}
