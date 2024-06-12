package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UploadFile extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("Chrome");
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		WebElement upload = driver.findElement(By.cssSelector("input[type='file']"));
		Thread.sleep(2000);		
		upload.sendKeys("D:/html/Excercises.txt");
		Thread.sleep(2000);
	}

}
