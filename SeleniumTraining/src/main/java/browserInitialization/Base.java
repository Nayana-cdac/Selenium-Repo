package browserInitialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver; // interface
 	public void initializeBrowser() 
 	{ 
 	driver=new ChromeDriver(); // interface obj = new class
 //	driver=new EdgeDriver(); 
 //	driver=new FirefoxDriver(); 
 	driver.get("https://selenium.qabible.in/index.php"); 
 	driver.manage().window().maximize(); // maximize the window
 	} 
 public void driverQuit() 
 { 
 	driver.close(); // only current page will close
 	driver.quit(); // All pages closed
 } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	Base b=new Base(); 
	 	b.initializeBrowser(); 
	 	//b.driverQuit();
	}

}
