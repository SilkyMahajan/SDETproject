package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

import Utilities.Hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ContactUs {
	
	 WebDriver driver=Hooks.driver;
	 @Given("^User is on OlaCorp page$")
	 public void user_is_on_OlaCorp_page() throws Throwable {
		 driver.get("https://corporate.olacabs.com/#/contact");
		 Thread.sleep(5000);		
		 driver.findElement(By.id("link-contact")).click();
	 }

}