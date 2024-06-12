package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Explicitwt {
   public static void main(String[] args) throws InterruptedException {

      // Initiate the Webdriver
      WebDriver driver = new ChromeDriver();

      // launching a browser and open a URL
      driver.get("https://www.tutorialspoint.com/index.htm");

      // identify element with locator xpath
      WebElement l = driver.findElement
         (By.xpath("/html/body/header/nav/ul/li[2]/a"));

      // explicit wait 2 secs for presence of incorrect element
      WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(2));
      wt.until(ExpectedConditions.presenceOfElementLocated
         (By.xpath("/html/body/header/nav/ul/li[2]/li")));

      // get text after presence of element condition is met
      System.out.println("Get text : " + l.getText());

      // Quitting browser
      driver.quit();
   }
}