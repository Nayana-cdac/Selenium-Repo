package browserInitialization;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorExample {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub 
 		WebDriver driver =new ChromeDriver(); 
 		driver.get("https://www.amazon.in/"); 
 		driver.manage().window().maximize(); 
 		JavascriptExecutor js = (JavascriptExecutor) driver;   
 	    js.executeScript("window.scrollBy(0,1000)",""); // scroll up 1000 - height
 		js.executeScript("window.scrollBy(0,-500)", "");// scroll down
 		
 		WebElement search=driver.findElement(By.id("twotabsearchtextbox")); // to click the search text box in amazon
		js.executeScript("arguments[0].click();",search); 
		search.click();
	}

}
