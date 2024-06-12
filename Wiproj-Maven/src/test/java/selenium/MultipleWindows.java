package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class MultipleWindows extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("Firefox");
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&hl=en&ifkv=AaSxoQzIkVEI7JBpO9vwem35JMBfNI05vXopQTBviXHq7eMbfW7IS5A3CTGnX1gV-eq5fZ7Mln41zg&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1660690429%3A1717060008375881&ddm=0");
		//click on Help, T&C
		driver.findElement(By.linkText("Help")).click();
		//driver.findElement(By.linkText("Privacy"));
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parent = it.next();//parent window
		String help = it.next();//child window - Help
		driver.switchTo().window(help);//child window - Help
		Thread.sleep(2000);
		System.out.println(driver.getTitle());//Help related title
		driver.switchTo().window(parent);//parent window
		Thread.sleep(2000);
		System.out.println(driver.getTitle());//accounts page 
		Thread.sleep(3000);
		driver.quit();
	}

}
