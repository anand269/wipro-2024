package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMSteps {
	WebDriver driver;
	@Given("User is on HRMLogin page")
	public void user_is_on_hrm_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver = new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@When("User enters username as {string} and {string}")
	public void user_enters_username_as_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@Then("User should be able to login successfully and home page is displayed")
	public void user_should_be_able_to_login_successfully_and_home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Logged in successfully");
	}

}
