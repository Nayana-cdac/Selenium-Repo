package browserInitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base {
	public void dropDownHandling() {
	    driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectInput = driver.findElement(By.xpath("//select[@id='single-input-field']"));//select tag should be there to use Select class
		Select select= new Select(selectInput);// create an object for Select class
		//select.selectByValue("Red");
		select.selectByIndex(2);
		//select.selectByVisibleText("Green");// select by text given in black font in the inspect select section	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropDown obj = new DropDown();
		obj.initializeBrowser();
		obj.dropDownHandling();
	}

}
