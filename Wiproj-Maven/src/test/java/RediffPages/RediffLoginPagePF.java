package RediffPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {
	
	WebDriver driver;
	public RediffLoginPagePF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);//add initialize the element
	}
	//@FindBy annotation to find the element in Page Factory - Optimised
	@FindBy(xpath="//input[@id='login1']") WebElement userName;
	@FindBy(css="input[id='password']") WebElement password;
	@FindBy(name="proceed") WebElement SignIn;
	@FindBy(partialLinkText="rediff.c") WebElement rediffHome;
	
	public WebElement userName()
	{
		return userName;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement SignIn()
	{
		return SignIn;
	}
	
	public WebElement rediffHome()
	{
		return rediffHome;
	}

}
