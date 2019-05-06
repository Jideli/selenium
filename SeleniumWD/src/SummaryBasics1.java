import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SummaryBasics1 {

	public static void main(String[] args) throws InterruptedException {
		// WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "/Users/Manon/Documents/selenium-java-3/chromedriver");
		WebDriver driver = new ChromeDriver();
		// driver = new ChromeDriver();
		driver.get("http://www.google.ch"); // or driver.get(baseURL);, waits till page is loaded
		
		driver.getCurrentUrl();
		driver.getTitle();
		driver.getPageSource();
		driver.close();
		driver.quit();
		
		driver.navigate().to("http://www.amazon.com"); // new site in same window, does not wait till page is loaded
		driver.navigate().back(); // back button
		driver.navigate().forward(); // move forward
		driver.navigate().refresh(); 
		driver.close();
			 	
		Thread.sleep(1000); // required InterruptedException
		driver.navigate().refresh();
		System.out.println("Refreshed the page");
		
		
		// SIMPLE LOCATORS
		driver.findElement(By.id("email")); // most preferred
		driver.findElement(By.id("pass"));
		driver.findElement(By.name("email")); // 2nd most preferred
		driver.findElement(By.name("pass"));	 	
		driver.findElement(By.className("inputtext"));
		driver.findElement(By.tagName("test")); // HTML tag name
		driver.findElement(By.linkText("Forgot account?"));
		driver.findElement(By.partialLinkText("Forgot"));
		
		
		// CSS SELECTOR
		driver.findElement(By.cssSelector("input#Email")); // tag and id, # represents id
		driver.findElement(By.cssSelector("#Email")); // also works
		
		driver.findElement(By.cssSelector("input.inputtext")); // tag and class, dot represents class
		driver.findElement(By.cssSelector("input[name=Email]")); // tag and attribute
		driver.findElement(By.cssSelector("input[name=Email]")); // tag, class and attribute
		
		// SUB STRING MATCHES <input="Employee_ID_001">
		driver.findElement(By.cssSelector("input[id^='Employee'")); // starts with
		driver.findElement(By.cssSelector("input[id$='001'")); // ends with
		driver.findElement(By.cssSelector("input[id*='ID'")); // contains
		driver.findElement(By.cssSelector("input:contains('ID')")); //contains
		
		/* LOCATING CHILD ELEMENTS (can only move forward)
		<div id="buttonDiv" class="small">
		<button id="submitButton" type="button" class="btn">Submit</button>
		</div>
		*/
		driver.findElement(By.cssSelector("div#buttonDiv>button")); // first go to div element with id ‘buttonDiv’ and then select its child element – ‘button’
		driver.findElement(By.cssSelector("div#buttonDiv button")); // first go to div element with id ‘buttonDiv’ and then select ‘button’ element inside it (which may be its child or sub child)
		/*
		<ul id="automation">
   		<li>Selenium</li>
   		<li>QTP</li>
   		<li>Sikuli</li>
		</ul>
		*/
		driver.findElement(By.cssSelector("ul#automation li:nth-of-type(2)"));
		driver.findElement(By.cssSelector("ul#automation li:last-child"));
		
		
		
		// XPATH
		/*
		<input id="Email" type="email" <span class="html-attribute-name">value</span>="" <span class="html-attribute-name">spellcheck</span>="<span class="html-attribute-value">false</span>" class="emailClass" 
autofocus="" <span class="html-attribute-name">name</span>="<span class="html-attribute-value">Email</span>" placeholder="Enter your email"/>
		 */
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]...")); // absolute path
		driver.findElement(By.xpath("//input[@id='Email']")); // relative path, single attribute
		driver.findElement(By.xpath("//*[@id='Email']")); // any tag
		driver.findElement(By.xpath("//input[@id='Email'][@name='Email']")); // multiple attributes
		driver.findElement(By.xpath("//input[@id='Email and @name='Email']")); // and
		driver.findElement(By.xpath("//input[@id='Email or @name='Email']")); // or
		driver.findElement(By.xpath("//input[contains(@id,'Email')]")); // contains
		driver.findElement(By.xpath("//input[starts-with(@id,'Ema')]")); // starts with
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")); // id content, 4th p tag within, button tag within
		
		driver.findElement(By.xpath("//*[text()='New look for sign-in coming soon']")); // text on page
		driver.findElement(By.xpath("(//input[@type='text'])[last()]")); // identify last text field in a form
		driver.findElement(By.xpath("(//input[@type='text'])[last()-1]")); // second last
		driver.findElement(By.xpath("(//input[@type='text'])[position()=2]")); // position 2 from top
		driver.findElement(By.xpath("(//label[2]")); // index position
		driver.findElement(By.xpath("//*[@id='FirstName']/following::input[@type='text']")); // select element of type text after FirstName
		driver.findElement(By.xpath("//*[@id='FirstName']/following::input")); // select input field after FirstName field
		driver.findElement(By.xpath("//*[@id='LastName']//preceding::input[@type='text']")); // select all elements of type text before the LastName field
				
		
		// ACTIONS
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.linkText("Forgot account?")).click();
		
		WebElement resultStats = driver.findElement(By.id("resultStats"));
		System.out.println("Results statistics: " + resultStats.getText()); // get text of web element
		
		String attributeValue = driver.findElement(By.name("nameSelenium")).getAttribute("value"); // get attribute value
		System.out.println("Available attribute value is :"+attributeValue);
		
		driver.findElement(By.id("form_1")).submit(); // submit form using form id
		driver.findElement(By.id("searchField")).sendKeys(Keys.ENTER); // hit enter
		
		
		
		// WAITS
		WebElement searchButton = driver.findElement(By.id("searchButton"));
		WebDriverWait waitVar = new WebDriverWait(driver, 10);
		waitVar.until(ExpectedConditions.elementToBeClickable(searchButton)); // expected condition + more...
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // implicit wait
		
		Thread.sleep(5000); // pause execution for 5 seconds (part of Java)
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS); // waits at least 100, then exception (throws Exception)
		
		// fluent wait a bit more complicated: max wait and define check intervals
			
		
		// VERIFY
		String actualTitle = "";
		String expectedTitle = "Google";
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title incorrect. Expected: " + expectedTitle + "; Actual: " + actualTitle);
		}
	
		System.out.println("Radio button is displayed: "+ driver.findElement(By.cssSelector("#test")).isDisplayed());
		System.out.println("Radio button is enabled: "+ driver.findElement(By.cssSelector("#test")).isEnabled());
		System.out.println("Radio button is selected: "+ driver.findElement(By.cssSelector("#test")).isSelected());
		
	}
}
