// options to change browser after launching

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel19_BrowserWindowHandle {

     public static void main(String[] args){
    	 	System.setProperty("webdriver.chrome.driver", "/Users/Manon/Documents/selenium-java-3/chromedriver");
    	 	WebDriver driver = new ChromeDriver();
    	 	driver.get("http://www.google.com");
    	 	System.out.println("Google launched in Chrome Browser");
    	 	
    	 	// maximize window
    	 	driver.manage().window().maximize();
    	 	
    	 	Options option = driver.manage(); //options interface
    	 	Window window = option.window(); //open window interface
    	 	window.maximize(); // same as above statement driver.manage...
    	 	
    	 	// no driver.manage option for minimizing window. therefore:
    	 	Dimension d = new Dimension(500,500);
    	 	driver.manage().window().setSize(d);
    	 	
    	 	// print size
    	 	System.out.println("Browser window size: "+driver.manage().window().getSize());
    	 	
    	 	// set position of current window e.g. upper left
    	 	Point newpoint = new Point(300,500);
    	 	driver.manage().window().setPosition(newpoint);
    	 	System.out.println("Current position is: "+driver.manage().window().getPosition());
    	 	
    }
}