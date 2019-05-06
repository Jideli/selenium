import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SummaryBasics3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		
		try {
			
		System.setProperty("webdriver.chrome.driver", "/Users/manonwacker/Documents/selenium-java-3/chromedriver");
		driver = new ChromeDriver(); 
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		// RIGHT-CLICK (COPY PASTE FROM MENU)
		 Actions action = new Actions(driver);
		 
		 By locator = By.cssSelector(".context-menu-one");
         WebElement rightClickElement=driver.findElement(locator);
         
         action.contextClick(rightClickElement).build().perform();
         WebElement getCopyText =driver.findElement(By.cssSelector(".context-menu-icon-copy"));
  
         String GetText = getCopyText.getText();
         System.out.println(GetText);
         
		
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (driver != null) {
				// driver.close();
			}
		}
		
		
	}
}
