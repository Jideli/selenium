import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel09_DriverNavigationMethods {

	public static void main(String[] args) throws InterruptedException { // throws method is needed for Thread.sleep
		// InterruptedException is a caught exception, so you can't compile unless you handle or declare
		// this type of exception on any method which joins or sleeps a Thread, or calls wait() on Object
		
		System.setProperty("webdriver.gecko.driver", "/Users/Manon/Documents/selenium-java-3/geckodriver");
	 	WebDriver driver = new FirefoxDriver();
	 	driver.get("http://www.facebook.com");
	 	System.out.println("Facebook launched in Firefox Browser");
	 
	 	// navigates to the new page in the same browser window
	 	driver.navigate().to("http://www.amazon.com");
	 	System.out.println("Navigated to Amazona.com");
	 	
	 	// click on back button in the browser
	 	driver.navigate().back();
	 	System.out.println("Navigated back to Facebook");
	 	
	 	// move forward
	 	driver.navigate().forward();
	 	System.out.println(driver.getTitle());
	 	driver.close();
	 	
	 	// refresh current webpage (F5)
	 	// wait for 5 seconds first for visibility
	 	Thread.sleep(1000);
	 	driver.navigate().refresh();
	 	System.out.println("Refreshed the page");
	}
}
