package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Utilities.Hooks;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	 WebDriver driver=Hooks.driver;
	
	@Given("^User navigate to Google page$")
	public void user_navigate_to_Google_page() throws Throwable {
	  // System.setProperty("webdriver.chrome.driver", "C:\\Silky\\Software\\chromedriver.exe");
	  //driver=new ChromeDriver();
	   driver.get("https://www.google.com");
	    //throw new PendingException();
	}

	@When("^User Enter value in search box$")
	public void user_Enter_value_in_search_box() throws Throwable {
	   driver.findElement(By.name("q")).sendKeys("IBM");
	}
	
	@When("^User Enter value in search box \"([^\"]*)\"$")
	public void user_Enter_value_in_search_box(String arg1) throws Throwable {
		 driver.findElement(By.name("q")).sendKeys(arg1);
		System.out.println("test123");
	    throw new PendingException();
	}

	@Then("^Result will display$")
	public void result_will_display() throws Throwable {
	   driver.findElement(By.name("btnK")).click();
	    throw new PendingException();
	}
	
	@Then("^Result will display \"([^\"]*)\" , \"([^\"]*)\"$")
	public void result_will_display(String arg1, String arg2) throws Throwable {
		System.out.println("test124");
	    throw new PendingException();
	}


}
