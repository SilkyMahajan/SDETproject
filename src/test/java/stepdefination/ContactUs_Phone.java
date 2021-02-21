package stepdefination;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import Utilities.Hooks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUs_Phone {
	
	WebDriver driver=Hooks.driver;
	
	//Validate the phone field values
	@When("^Validate value in phone \"([^\"]*)\" field$")
	public void validate_value_in_phone_field(String arg1) throws Throwable {
		driver.findElement(By.id("email43")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail.com");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_TAB);
		driver.findElement(By.xpath("//input[@name='corporate_name']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='phone_no']")).sendKeys(arg1);
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

	//Verify the error message to for Phone field
	@Then("^Error Message displyed entering min value in phone \"([^\"]*)\"$")
	public void error_Message_displyed_entering_min_value_in_phone(String arg1) throws Throwable {
		Thread.sleep(2000);
		String phoneValue=driver.findElement(By.xpath("//input[@name='phone_no']")).getAttribute("value");
		System.out.println(phoneValue);
		int size = phoneValue.length();
		if (size < 10 ) {
			System.out.println("Enter correct value in phone number.");
		}
		else if(arg1.length()>size)
		{
			System.out.println("Phone value can't be more than 9 digit");
		}
		
	}
}
