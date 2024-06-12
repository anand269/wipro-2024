package selenium;

import java.time.Duration;

import org.openqa.selenium.By;

public class PracticePage extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("admin");
		driver.findElement(By.name("inputPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		//Thread.sleep(2000);
		String s = driver.findElement(By.xpath("//p[@class='error']")).getText();
		System.out.println(s);
	}

}
