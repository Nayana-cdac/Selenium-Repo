package browserInitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionClass {

	public static void main(String[] args) { 
 		// TODO Auto-generated method stub 
 		   WebDriver driver =new ChromeDriver(); 
 		   driver.get("https://selenium.qabible.in/drag-drop.php"); 
 		   driver.manage().window().maximize(); 
 		    
 		   WebElement draggable=driver.findElement(By.xpath("//span[text()='Draggable n°1']")); //tagname[text()='value'] - dynamic xpath
 		   System.out.println(draggable.getText()); 
 		   Actions actions=new Actions(driver); //object of action class
 		   actions.moveToElement(draggable).click(); //choose element to move
 		   //actions.moveToElement(draggable).build().perform(); 
 		   actions.doubleClick(draggable).perform(); 
 		   actions.contextClick(draggable).perform(); //where to drag to destination 
 		   WebElement destination=driver.findElement(By.xpath("//div[@id='mydropzone']")); // destination to drop the dragged item
 		   actions.dragAndDrop(draggable, destination).build().perform(); 
 	}

}
