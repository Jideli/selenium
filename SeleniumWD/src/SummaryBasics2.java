import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.openqa.selenium.Dimension;

public class SummaryBasics2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		// TRY, CATCH, FINALLY
		try {
			
		System.setProperty("webdriver.chrome.driver", "/Users/manonwacker/Documents/selenium-java-3/chromedriver");
		driver = new ChromeDriver();
		// driver.get("https://www.toolsqa.com/automation-practice-form/"); 
		// driver.get("https://www.toolsqa.com/automation-practice-switch-windows/"); 
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		
		// SELECT FROM DROP DOWN
		Select continent = new Select(driver.findElement(By.cssSelector("select#continents")));
		System.out.println(continent.isMultiple()); // is multiple selection possible?
		WebElement selectedContinent = continent.getFirstSelectedOption(); // get default value and print
		System.out.println("Default selection: "+selectedContinent.getText());
		
		List<WebElement> continents = continent.getOptions(); // get list of all options and print
		for (WebElement dd:continents) {
			System.out.println("Option: "+dd.getText());
		}
		
		continent.selectByIndex(2); // select by index
		continent.selectByValue("value"); // value in option tag under select
		continent.selectByVisibleText("Australia");
		System.out.println("Newly selected: "+continent.getFirstSelectedOption().getText());
		
		
		// LIST ELEMENTS USING FINDELEMENTS
		List<WebElement> elements = driver.findElements(By.name("exp")); // demo form
		System.out.println(elements.size()); // get number of elements
		
		for (int i=0; i<elements.size();i++){
			System.out.println("Radio button text: "+elements.get(i).getAttribute("value"));
		}
		
		
		// RADIO BUTTON AND CHECKBOXES
		driver.findElement(By.id("profession-0")).click();
		
		
		// CHANGE WINDOW SIZE, POSITION AND MAXIMIZE
		driver.manage().window().maximize(); // or using Options interface: Options option = driver.manage(); Window window = option.window(); window.maximize();
		
		Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d); // set new window size
		System.out.println(driver.manage().window().getSize());
		
		Point newpoint = new Point(300,500); // set window position
		driver.manage().window().setPosition(newpoint);
		System.out.println(driver.manage().window().getPosition());
		
		
		// SWITCHING BETWEEN WINDOWS
		WebElement openNew = driver.findElement(By.id("button1"));
		openNew.click();
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles(); // get all handles
		allWindows.remove(parentWindow); // remove parent handle
		
		for (String handle : allWindows) {
			System.out.println("Window handle: "+handle);
			driver.switchTo().window(handle); // switch to child
			System.out.println(driver.getCurrentUrl());
			driver.close(); 
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
		
		
		// MOUSE HOVER
		WebElement hoverItem = driver.findElement(By.linkText("Tutorial"));
		Actions action = new Actions(driver);
		action.moveToElement(hoverItem).perform();
		
		
		// ALERT HANDLING
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		Thread.sleep(3000);
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Pop Up']"));
		Thread.sleep(3000);
		Alert simpleAlert2 = driver.switchTo().alert();
		simpleAlert2.dismiss();
		
		
		// UPLOAD FILES using sendKeys method
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (driver != null) {
			//	driver.close();
			}
		}
		
		
	}
}

