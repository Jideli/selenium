import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel16CheckboxesAndRadiobuttons {

     public static void main(String[] args){
    	 	System.setProperty("webdriver.chrome.driver", "/Users/Manon/Documents/selenium-java-3/chromedriver");
    	 	WebDriver driver = new ChromeDriver();
    	 	driver.get("http://www.goibibo.com");
    	 	System.out.println("Goibibio launched in Chrome Browser");
    	 	
    	 	// Radio buttons can be selected by using click() method
    	 	// isDisplayed is to check whether element is displayed on web page
    	 	// isEnabled() is to check whether element is enabled to perform action on it
    	 	// isSelected() to validate whether element is selected for now
    	 	
    	 	System.out.println("Round trip radio button is displayed: "+driver.findElement(By.cssSelector("#gi_roundtrip_label")).isDisplayed());
    	 	System.out.println("Round trip radio button is enabled: "+driver.findElement(By.cssSelector("#gi_roundtrip_label")).isEnabled());
    	 	driver.findElement(By.cssSelector("#gi_roundtrip_label")).click();
    	 	System.out.println("Round trip radio button is selected: "+driver.findElement(By.cssSelector("#gi_roundtrip_label")).isSelected());
    	 	
    	 	// Checkboxes
    	 	System.out.println("Student fare only checkbox is displayed"+driver.findElement(By.cssSelector("#student_fare_check")).isDisplayed());
    	 	System.out.println("Student fare only checkbox is enabled"+driver.findElement(By.cssSelector("#student_fare_check")).isEnabled());
    	 	driver.findElement(By.cssSelector("#student_fare_check")).click();
    	 	System.out.println("Student fare only checkbox is selected: "+driver.findElement(By.cssSelector("#student_fare_check")).isSelected());

    }
}