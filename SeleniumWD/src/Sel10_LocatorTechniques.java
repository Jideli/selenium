import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel10_LocatorTechniques {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/Manon/Documents/selenium-java-3/geckodriver");
	 	WebDriver driver = new FirefoxDriver();
	 	driver.get("http://www.facebook.com");
	 	System.out.println("Google launched in Firefox Browser");
	 
	 	// 8 different types of locators
	 
	 	// ID locator --> most preferred way
	 	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	 	driver.findElement(By.id("pass")).sendKeys("abcdefg");
	 	
	 	// Name locator --> second most preferred way
	 	driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
	 	driver.findElement(By.name("pass")).sendKeys("abcdefg");
	 	
	 	// Class name locator, must be unique. Cannot use it if occurs for several fields
	 	driver.findElement(By.className("test")).sendKeys("test");
	 	
	 	// HTML tag name, may not be unique
	 	driver.findElement(By.tagName("test")).sendKeys("test");
	 
	 	// For clicking on link texts, should be unique
	 	driver.findElement(By.linkText("Forgot account?")).click();
	 	
	 	// use partial link text, should be unique on the page
	 	driver.findElement(By.partialLinkText("Forgot")).click();
	 	
	}
}
