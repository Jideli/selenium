// in some cases, attribute values will change on page refresh
// aim is to find a static part of an attribute 
// e.g. id='abcd1234' where abcd will remain the same and is unique

// use starts-with method: //*[starts-with(@id,'abcd')]
// or use contains and text method if part of attribute value is known: //*[contains(text(),'Forgotten')] --> see code below

// in Inspector, search for a text using: //span[text()='Create an account']
// but whole text must be entered, not only 'Create an'

// in Inspector, find out how many input tags there are by entering '//input' --> .e.g 1 out of 39
// narrow it down by adding attribute class and indicate which of the 2 last occurrences to refer to: (//input[@class='inputtext'])[position()=2]
// or just indicate index number: (//input[@class='inputtext'])[2]

// or use last method to refer to last element of all input tags: (//input[@class='inputtext'])[last()]
// or move backward with -1, -2, etc: ()//*[@datatype='text'])[last()-1]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel12_DynamicXPath {

     public static void main(String[] args){
    	 	System.setProperty("webdriver.chrome.driver", "/Users/Manon/Documents/selenium-java-3/chromedriver");
    	 	WebDriver driver = new ChromeDriver();
    	 	driver.get("http://www.google.com");
    	 	System.out.println("Google launched in Chrome Browser");
    	 	
    	 	driver.findElement(By.xpath("//*[contains(text(),'Forgotten')]")).click();
    	 	driver.findElement(By.xpath("//a[contains(@id, 'contact_link')]")).click();
    }
}
