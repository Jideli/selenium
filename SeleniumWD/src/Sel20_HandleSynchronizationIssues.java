
// when page elements haven't loaded on time to be used by script
// handle them using some Selenium methods
// classified in two ways: unconditional and conditional
// unconditional: specify only timeout and Selenium will wait until time elapsed before continues with statement execution


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel20_HandleSynchronizationIssues {

     public static void main(String[] args) throws Exception{
    	 	System.setProperty("webdriver.chrome.driver", "/Users/Manon/Documents/selenium-java-3/chromedriver");
    	 	WebDriver driver = new ChromeDriver();
    	 	driver.get("http://www.naviltesting.com");
    	 	System.out.println("Navil Testing launched in Chrome Browser");
    	 	
    	 	// 3 different ways below:
    	 	
    	 	// Thread.sleep(15000); // Thread is part of Java, not Selenium, sleep is static method of Thread class
    	 	// driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS); // waits for page to load if time is less than specified, if not then exception
    	 	
    	 	//implicit wait: same behaviour as for page load method, applicable for all findELements
    	 	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
    	 	
    	 	//conditional sync - WebDriverWait class - condition must be passed: wait for link to appear
    	 	WebDriverWait wait = new WebDriverWait(driver,15);
    	 	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Job Seeker"))).click();
    	 	
    	 	driver.findElement(By.linkText("Job Seeker")).click();
    	 	
    	 	// disadvantage: low performance due to longer waits, try to avoid it
    }
}


