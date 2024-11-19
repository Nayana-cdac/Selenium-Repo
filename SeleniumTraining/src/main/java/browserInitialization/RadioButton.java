package browserInitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base {
	public void radioButtonHandling() {
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radioButton = driver.findElement(By.id("inlineRadio2"));
		radioButton.click();
		WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
		button.click();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton obj = new RadioButton();
		obj.initializeBrowser();
		obj.radioButtonHandling();
	}

}
