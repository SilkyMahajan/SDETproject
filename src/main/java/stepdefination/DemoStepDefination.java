package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepDefination {
	public WebDriver driver;
	@Given("^User is on facebook page$")
	public void user_is_on_facebook_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Silky\\Software\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://www.facebook.com");
	}

	@When("^he enter the value in all mandatory fields \"([^\"]*)\" , \"([^\"]*)\"$")
	public void he_enter_the_value_in_all_mandatory_fields(String userid, String password) throws Throwable {
		driver.findElement(By.name("email")).sendKeys(userid);
		driver.findElement(By.name("pass")).sendKeys(password);
	}

	@Then("^Click on Create Account button$")
	public void click_on_Create_Account_button() throws Throwable {
		driver.findElement(By.name("login")).click();
	    throw new PendingException();
	}



}
