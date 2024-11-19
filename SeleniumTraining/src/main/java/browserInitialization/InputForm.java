package browserInitialization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputForm extends Base {
	public void inputForm() {
		WebElement inputForm = driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputForm.click();
		WebElement message = driver.findElement(By.id("single-input-field"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // create wait object using WebDriverWait class
		message.sendKeys("Hello");
		wait.until(ExpectedConditions.visibilityOf(message));// to check the visibility 
		WebElement buttonClick = driver.findElement(By.xpath("//button[@id='button-one']"));
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	 	wait.until(ExpectedConditions.elementToBeClickable(buttonClick));// wait for button click
	 	//wait.until(ExpectedConditions.elementToBeSelected(message));
		buttonClick.click();		
	}
	 public void waitForClickingElement(WebDriver driver, WebElement element) { 
	 		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //explicit wait for a particular element
	 		wait.until(ExpectedConditions.elementToBeClickable(element)); 
	 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputForm obj = new InputForm();
		obj.initializeBrowser();
		obj.inputForm();
	}

}
