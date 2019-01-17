// if need to move to different window e.g. pop up window or move between multiple windows back and forth

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel18_MultipleWindows {

     public static void main(String[] args){
    	 	System.setProperty("webdriver.chrome.driver", "/Users/Manon/Documents/selenium-java-3/chromedriver");
    	 	WebDriver driver = new ChromeDriver();
    	 	driver.get("http://www.google.com"); // find site with popup window
    	 	
    	 	String parentWindow = driver.getWindowHandle();
    	 	String parentWindowTitle = driver.getTitle();
    	 	
    	 	System.out.println("Parent Window Handle String: " +parentWindow);
    	 	System.out.println("Parent Window Title String: " +parentWindowTitle);
    	 	
    	 	Set<String> windowHandles = driver.getWindowHandles(); // gets all windows
    	 	/*windowHandles.remove(parentWindow); // to display only child window
    	 	
    	 	for(String child:windowHandles) {
    	 		driver.switchTo().window(child);
    	 		System.out.println(driver.getTitle());
    	 	}*/
    	 	Iterator<String> itr = windowHandles.iterator();
    	 	while(itr.hasNext()){ // takes one by one
    	 		String childWindow = itr.next();
    	 		if (!parentWindow.equals(childWindow)){
    	 			System.out.println("Child window: "+driver.switchTo().window(childWindow).getTitle());
    	 		}
    	 	}
 
    	 	
    	 	// move focus back to parent window
    	 	driver.switchTo().window(parentWindow);
    	 	System.out.println("Back to parent window: " +driver.getTitle());
    	 	
    	 	driver.quit();
    	 	
    }
}