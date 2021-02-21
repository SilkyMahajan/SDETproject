package stepdefination;

import Utilities.Hooks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ContactUs_Name {
	WebDriver driver=Hooks.driver;
	
	//Entering the values to check Name field length 
	@When("^Enter value in \"([^\"]*)\" to validate field length$")
	public void enter_value_in_to_validate_field_lenght(String arg1) throws Throwable {
			driver.findElement(By.id("email43")).sendKeys(arg1);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail.com");
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
	
		//Submit button click to verify the error message
		@Then("^Error Message displyed for Name \"([^\"]*)\" field$")
		public void error_Message_displyed_for_Name_field(String arg1) throws Throwable {
			Thread.sleep(2000);
			WebElement userNameTxt=driver.findElement(By.id("email43"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			String namevalue = (String) js.executeScript("return arguments[0].value", userNameTxt);
			if(arg1.length()>namevalue.length())
			{
				System.out.println("Name value can't be more than 100 characters");
			}						 
		}	
		
		// Entering value with enter value in Name field to check mandatory name field
		@When("^Click on Sumit button with entering value in the field$")
		public void click_on_Sumit_button_with_entering_value_in_the_field() throws Throwable {
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail.com");
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_TAB);
			Select ddlCountry = new Select(driver.findElement(By.id("country")));
			ddlCountry.selectByIndex(1);
			driver.findElement(By.xpath("//input[@name='corporate_name']")).sendKeys("test");
			driver.findElement(By.xpath("//input[@name='phone_no']")).sendKeys("123456789");
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_TAB);
			Select ddlDepartment = new Select(driver.findElement(By.id("department")));
			ddlDepartment.selectByIndex(0);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_TAB);
			Select ddlEmp = new Select(driver.findElement(By.id("employees")));
			ddlEmp.selectByIndex(0);
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
		//Submit button click to verify the message
		@Then("^Error Message displyed for mandatory name field$")
		public void error_Message_displyed_for_mandatory_name_field() throws Throwable {
			Thread.sleep(2000);
			String errorMessage = driver.findElement(By.xpath("//*[text()='Please correct the highlighted fields']")).getText();
			System.out.println("Name is field is empty");
			String actualMsg = "Please correct the highlighted fields";
			 if (errorMessage==actualMsg)
			 {
				 System.out.println("Name is field is empty");
			 }
		}
}
