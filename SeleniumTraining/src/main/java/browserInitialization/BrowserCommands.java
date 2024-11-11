package browserInitialization;

public class BrowserCommands extends Base{
	 public void browserCommands() 
	 	{ 
	 		String title=driver.getTitle(); // get title of launched browser - abstract method
	 		System.out.println(title); 
	 		String url=driver.getCurrentUrl(); // get current browser url
	 		System.out.println(url); 
	 		String pagesource=driver.getPageSource(); //to get html code of the browser page
	 		System.out.println(pagesource); 
	 	} 
	  
	 	public static void main(String[] args) { 
	 		BrowserCommands b=new BrowserCommands(); 
	 		b.initializeBrowser(); 
	 		b.browserCommands(); 
	 		b.driverQuit(); 
	  
	 	}
}
