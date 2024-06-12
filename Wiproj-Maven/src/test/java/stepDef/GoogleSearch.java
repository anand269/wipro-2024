package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleSearch {
	WebDriver driver;
	WebElement txtBox;
	@Given("Browser is open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new EdgeDriver();
	    System.out.println("Browser opened");
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.navigate().to("https://www.google.com");
	   System.out.println("User is on google search page");
	}

	@And("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
	    // Write code here that turns the phrase above into concrete actions
		txtBox = driver.findElement(By.name("q"));
		txtBox.sendKeys("Cucumber BDD ");
	    
	}

	@Then("hits enter")
	public void hits_enter() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		txtBox.sendKeys(Keys.ENTER);
	   System.out.println("Hits enter");
	}

	@Then("user is navigated to search results page")
	public void user_is_navigated_to_search_results_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is navigated to search results page");
	}

	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
	    driver.close();
	    System.out.println("Browser closed");
	}


}