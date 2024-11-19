package browserInitialization;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling extends Base {
	
	public void windowhandle() 
 	{ 
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://webdriveruniversity.com/"); 
 		WebElement contactus=driver.findElement(By.xpath("//h1[text()=\"CONTACT US\"]")); 
 		//contactus.click(); 
 		 
 		WebElement loginportal=driver.findElement(By.xpath("//h1[text()=\"LOGIN PORTAL\"]")); 
 		loginportal.click(); 
 		contactus.click(); 
 		 
 		String parent=driver.getWindowHandle(); // generate parent window id - unique id and store in parent string
 		System.out.println("parent" +parent); 
 		 
 		Set<String> allwindows=driver.getWindowHandles();// all opened windows - to set multiple windows we should use Set interface 
 		 
 		for(String temp:allwindows) 
 		{ 
 			if(!temp.equals(parent)) 
 			{ 
 			System.out.println("window:"+temp); 
 			driver.switchTo().window(temp); // switch to login portal and contact page 
 			 
 			System.out.println(driver.getTitle()); 
 			System.out.println(driver.getCurrentUrl()); 
 			System.out.println("********************************************************************"); 
 			 
 		 
 		} 
 			 
 		}
 		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandling obj = new MultipleWindowHandling();
		obj.initializeBrowser();
		obj.windowhandle();
	}

}
