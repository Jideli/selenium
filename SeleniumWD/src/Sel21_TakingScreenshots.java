// interface called TakeScreenshot
// method called getScreenshotAs

// how to handle when test is repeated? is there a way to overwrite existing screenshots?
// or does screenshot name have to changed every time?e


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel21_TakingScreenshots {

     public static void main(String[] args) throws Exception{
    	 	System.setProperty("webdriver.chrome.driver", "/Users/Manon/Documents/selenium-java-3/chromedriver");
    	 	WebDriver driver = new ChromeDriver();
    	 	driver.get("http://www.amazon.in");
    	 	
    	 	driver.manage().window().maximize();
    	 	System.out.println("Amazon.in launched in Chrome Browser");
    	 	
    	 	// separate class ScreenshotBase created for capturing screenshot every time
    	 	ScreenshotBase.captureScreenshot(driver, "amazonHomePage");
    	 	Thread.sleep(5000);
    	 	
    	 	driver.navigate().to("http://www.flipkart.com");
    	 	System.out.println("flipkart.com is launched in Chrome Browser");
    	 	
    	 	ScreenshotBase.captureScreenshot(driver, "flipkartHomePage");
    	 
    	 	// for new screenshots, screenshot names have to be changed
    	 	
    }
}

