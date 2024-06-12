package selenium;

import org.openqa.selenium.By;

public class FrameDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("Edge");
		driver.get("file:///D:/Automation/html/iframpage.html");
		//Identify and enter value on f1 field
		driver.findElement(By.id("t1")).sendKeys("Hello");
		
		//switch to iframe
		driver.switchTo().frame(0);//switch to iframe
		driver.findElement(By.id("t2")).sendKeys("Automation");
		driver.findElement(By.id("t3")).sendKeys("Selenium");

		//switch back to main frame
		driver.switchTo().defaultContent();//move to main window
		driver.findElement(By.id("t1")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("Learning");
		
		
		
		
		
		
		
		
		
	}

}
