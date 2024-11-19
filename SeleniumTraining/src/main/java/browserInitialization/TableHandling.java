package browserInitialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {
	
	public void printTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
				
	}
	public void rowPrint(){
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]"));
		System.out.println(row.getText());
		
	}
	public void columnPrint() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		 List <WebElement> table=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1] ")); // need to get 10 of 10 elements so use findElements and List
		 for(WebElement menu:table) 
		 { 
		 	System.out.println(menu.getText());
		 }
	}
	
	 public void elementSearch() 
		{ 
			String input="Ashton Cox"; 
			driver.navigate().to("https://selenium.qabible.in/table-pagination.php"); 
			List<WebElement> table=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]")); 
			for(WebElement element:table) 
			{ 
			if(element.getText().equals(input)) 
			{ 
				System.out.println(element.getText()); 
				 
			} 
			} 
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling obj = new TableHandling();
		obj.initializeBrowser();
	//	obj.printTable();
	//	obj.rowPrint();
	//	obj.columnPrint();
		obj.elementSearch();
	}

}
