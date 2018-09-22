// usually forms are used to capture information from end users
// static drop downs: drop down list of values is fixed e.g. day for birth date drop downs
// select tags are used to create drop downs

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; // needed to import this
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel15_staticDropdowns {

     public static void main(String[] args){
    	 	System.setProperty("webdriver.chrome.driver", "/Users/Manon/Documents/selenium-java-3/chromedriver");
    	 	WebDriver driver = new ChromeDriver();
    	 	driver.get("http://www.facebook.com");
    	 	System.out.println("Facebook launched in Chrome Browser");
    	 	
    	 	// create object for the select class
    	 	Select day = new Select(driver.findElement(By.cssSelector("#day")));
    	 	
    	 	// System.out.println(day.isMultiple()); // checks whether drop down allows multiple values and returns true or false
    	 	/*
    	 	WebElement daySelected = day.getFirstSelectedOption(); // will retrieve default value
    	 	System.out.println("Selected Day: "+daySelected.getText()); // getText will turn it into text format
    	 	
    	 	List<WebElement> days = day.getOptions(); // retrieve all options which are available
    	 	for(WebElement dd:days) {
    	 		System.out.println("Option: "+ dd.getText());
     	 	}
    	 	*/
    	 	// if you want to select a value
    	 	day.selectByIndex(12); // by index
    	 	System.out.println("Selected day: "+day.getFirstSelectedOption().getText());
    	 	
    	 	// create object for month drop down using name attribute 
    	 	
    	 	Select month = new Select(driver.findElement(By.name("birthday_month")));
    	 	month.selectByValue("5"); // value in option tag under select tag
    	 	System.out.println("Selected month: "+month.getFirstSelectedOption().getText());
    	 	
    	 	Select year = new Select(driver.findElement(By.xpath("//*[@title='Year']")));
    	 	year.selectByVisibleText("2005");
    	 	System.out.println("Selected year: "+year.getFirstSelectedOption().getText());
    	 	
    }
}