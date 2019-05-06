import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel08_BasicMethodsOfSeleniumWebdriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/Manon/Documents/selenium-java-3/geckodriver");
	 	WebDriver driver = new FirefoxDriver();
	 	driver.get("http://www.google.com");
	 	System.out.println("Google launched in Firefox Browser");
	 
	 	// print URL
	 	System.out.println(driver.getCurrentUrl());
	 	
	 	// print title of page (text written in browser tab)
	 	System.out.println(driver.getTitle());
	 	
	 	// print page source
	 	System.out.println(driver.getPageSource());
	 	
	 	// close currently opened browser window
	 	driver.close();
	 	
	 	// close all windows associated with the driver (also popups)
	 	driver.quit();
	 	
	}
}
