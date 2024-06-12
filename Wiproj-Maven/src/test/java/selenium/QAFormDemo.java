package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QAFormDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("firefox");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form");
		//identify the web element
		WebElement gender = driver.findElement(By.id("gender-radio-1"));
		System.out.println("Displayed : "+ gender.isDisplayed());
		System.out.println("Is Enabled : "+ gender.isEnabled());
		System.out.println("Is Selected : "+ gender.isSelected());
		Thread.sleep(3000);
		gender.click();
		System.out.println("Displayed : "+ gender.isDisplayed());
		System.out.println("Is Enabled : "+ gender.isEnabled());
		System.out.println("Is Selected : "+ gender.isSelected());
	}

}
