package browserInitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	
	public void simpleAlert() {
		driver.navigate().to(" https://selenium.qabible.in/javascript-alert.php"); 
 		WebElement click1=driver.findElement(By.xpath("//button[@onclick='jsAlert()']")); 
 		click1.click(); 
 		String alerttext=driver.switchTo().alert().getText(); // to get the text in the alert box 
 		System.out.println(alerttext);
 		driver.switchTo().alert().accept();// to click the ok button in the alert box
	}
	
	public void comfirmationAlert() {
		driver.navigate().to(" https://selenium.qabible.in/javascript-alert.php"); 
		WebElement confirm=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")); 
 		confirm.click(); 
 		driver.switchTo().alert().dismiss();	// to click cancel button in the alert box
	}
	
	public void promptAlert() {
		    driver.navigate().to(" https://selenium.qabible.in/javascript-alert.php"); 
		    WebElement prompt=driver.findElement(By.xpath(" //button[@onclick='jsPrompt()']")); 
	 		prompt.click(); 
	 	    driver.switchTo().alert().sendKeys("Amalu"); // to enter the text in the prompt alert box
	 		driver.switchTo().alert().accept();	//	to click ok button
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alert = new AlertHandling();
		alert.initializeBrowser();
	//	alert.simpleAlert();
	//	alert.comfirmationAlert();
		alert.promptAlert();
	}

}
