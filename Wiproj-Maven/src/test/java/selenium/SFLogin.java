package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SFLogin extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://login.salesforce.com/");
	//	System.out.println(driver.getPageSource());
		
		WebElement uName=driver.findElement(By.id("username"));
		WebElement uPwd=driver.findElement(By.name("pw"));
		
		//Action
		uName.sendKeys("Admin");
		uName.clear();//clear the text on the text box field
		uName.sendKeys("Admin");
		driver.findElement(By.name("pw")).sendKeys("Admin123");
		
		//Login btn click xpath-> //tagName[@attribute='value']
		WebElement loginBtn = driver.findElement(By.xpath("//input[@name='Login']"));
		loginBtn.click();
		//Thread.sleep(2000);
		//capture the error msg
		WebElement errMsg = driver.findElement(By.id("error"));
		String error = errMsg.getText();
		System.out.println(error);//console ?
		
		//validation -> invalid crede-> error
		if(error.contains("If you still can't log in"))
		{
			System.out.println("Test case Pass");
		}
		else
			System.out.println("Fail");
	}

}
