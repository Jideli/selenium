import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFFBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/Manon/Documents/selenium-java-3/geckodriver");
	 	WebDriver driver = new FirefoxDriver();
	 	driver.get("http://www.google.com");
	 	System.out.println("Google launched in Firefox Browser");
	 

	}
}
