package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("edge");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://login.salesforce.com/");
	//	System.out.println(driver.getPageSource());
		
		WebElement uName=driver.findElement(By.id("username"));
		uName.sendKeys("Admin");
		//WebElement uPwd=driver.findElement(By.name("pw"));
		//uPwd.sendKeys("Admin123");
		By password = RelativeLocator.with(By.tagName("input")).above(By.id("Login"));
		driver.findElement(password).sendKeys("admin123");
		//locate password
		By LgnBtn = RelativeLocator.with(By.tagName("input")).below(By.id("password"));
		driver.findElement(LgnBtn).click();
		
		
	}

}
