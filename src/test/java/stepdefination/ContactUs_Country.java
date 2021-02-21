package stepdefination;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Utilities.Hooks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUs_Country {

WebDriver driver=Hooks.driver;

//Entering values to validate mandatory Country drop down list
@When("^Validate value in Country field is mandatory$")
public void validate_value_in_Country_field_is_mandatory() throws Throwable {
	driver.findElement(By.id("email43")).sendKeys("Test");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail.com");
	Robot robot = new Robot();
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

@Then("^Error Message displyed without entering value in Country$")
public void error_Message_displyed_without_entering_value_in_Country() throws Throwable {
	Thread.sleep(2000);
	Select ddlDepartment = new Select(driver.findElement(By.id("department")));
	int abc=ddlDepartment.getOptions().indexOf(ddlDepartment.getFirstSelectedOption());
	System.out.println("aaaaaa" + abc +"bbbbbb");
}

//Entering values to validate options available in Country drop down list
@When("^Validate option available in Country field$")
public void validate_option_available_in_Country_field() throws Throwable {
	driver.findElement(By.id("email43")).sendKeys("Test");
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

@Then("^Verify the option of in Country drop downlist$")
public void verify_the_option_of_in_Country_drop_downlist() throws Throwable {
	Thread.sleep(2000);
	Select ddlDepartment = new Select(driver.findElement(By.id("department")));
	List <WebElement> allOptions =ddlDepartment.getOptions();
	System.out.println(allOptions.size());

	for (int j = 0; j < allOptions.size(); j++) {
		String options = ((WebElement) allOptions.get(j)).getText();
        System.out.println(options);

	}
}

}
