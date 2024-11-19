package browserInitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base{
	public void checkBoxHandling() {
		WebElement inputForm = driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputForm.click();
		WebElement linkedText = driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		linkedText.click();
		WebElement checkbox = driver.findElement(By.xpath("//label[@for='gridCheck']"));
		checkbox.click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox obj = new CheckBox();
		obj.initializeBrowser();
		obj.checkBoxHandling();
	}

}
