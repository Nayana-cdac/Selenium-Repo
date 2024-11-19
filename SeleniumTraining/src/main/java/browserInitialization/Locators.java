package browserInitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locators(){
		WebElement message = driver.findElement(By.id("single-input-field"));// interface interfaceName = webdrivername.function()
		WebElement name = driver.findElement(By.name("description"));
		WebElement className = driver.findElement(By.className("clearfix"));
		WebElement link = driver.findElement(By.linkText("simple-form-demo.php"));
		WebElement partialLink = driver.findElement(By.partialLinkText("simple-form-"));
		WebElement absoluteXpath= driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
		WebElement relativXpath = driver.findElement(By.xpath("//input[@id='single-input-field']")); //relativeXpath
		WebElement cssSelector1= driver.findElement(By.cssSelector("input#single-input-field")); //tag#id
		WebElement cssSelector2= driver.findElement(By.cssSelector("div.header-top")); //tag.class
		WebElement cssSelector3= driver.findElement(By.cssSelector("label[for=inputEmail4]")); //tag[attribute=value"]
		WebElement cssSelector4= driver.findElement(By.cssSelector("input.form-control[id=single-input-field]")); //tag.class[attribute=value"]
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
