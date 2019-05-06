import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SummaryTest {

	public static void main(String[] args) throws InterruptedException {
		// WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "/Users/manonwacker/Documents/selenium-java-3/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/"); 
		
		List<WebElement> elements = driver.findElements(By.name("exp"));
		System.out.println(elements.size()); // get number of elements
		
		for (int i=0; i<elements.size();i++){
			System.out.println("Radio button text: "+elements.get(i).getAttribute("value"));
		}
		
		
	
		
	}
}
