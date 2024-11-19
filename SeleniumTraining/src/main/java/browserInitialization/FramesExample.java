package browserInitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class FramesExample {
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    WebDriver driver =new ChromeDriver(); 
		    driver.navigate().to(" https://demo.guru99.com/test/guru99home/"); 
	 		WebElement iframe=driver.findElement(By.xpath(" //iframe[@id='a077aa5e']")); // switch to frame
	 		driver.switchTo().frame(iframe); // to switch from one window to another window
	 		//WebElement frame1=driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']")); 
	 		//frame1.click(); 
	 		WebElement img=driver.findElement(By.xpath("//img[@src='Jmeter720.png']")); // create web element for the image need to perform switching
	 		img.click(); 
	 		driver.switchTo().defaultContent();
	}

}
