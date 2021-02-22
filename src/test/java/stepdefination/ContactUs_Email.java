package stepdefination;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Utilities.Hooks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUs_Email {
	WebDriver driver=Hooks.driver;
	
	//Entering values in to validate Email address
	@When("^Enter value in \"([^\"]*)\" to validate the Email field$")
	public void enter_value_in_to_validate_the_Email_field(String arg1) throws Throwable {
		driver.findElement(By.id("email43")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(arg1);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_TAB);
		driver.findElement(By.xpath("//input[@name='corporate_name']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='phone_no']")).sendKeys("123456789");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_TAB);
		driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("testing name");
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//input[@name='submit'])[2]")));
		Thread.sleep(2000);
	}
	
	//Checking that in '@' and '.' is present in email address 
	@Then("^Error Message displyed for Email \"([^\"]*)\" field after entering wrong email address$")
	public void error_Message_displyed_for_Email_field_after_entering_wrong_email_address(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		String emailValue=driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value");
		System.out.println(emailValue);
		int atLocation = emailValue.indexOf('@');
		int dotLocation = emailValue.indexOf('.');
		System.out.println(atLocation);
		System.out.println(dotLocation);
		if (atLocation == -1 || dotLocation==-1) {
			System.out.println("EMail address must contain @ and . (dot)");
		}
		else
		{
			System.out.println("EMail address contains @ and . (dot)");
		}
		
	}
}
