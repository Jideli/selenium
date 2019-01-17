// when using external content in an iFrame, switchTo() method must first be used

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel17_FramesAndAlerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Manon/Documents/selenium-java-3/chromedriver");
	 	WebDriver driver = new ChromeDriver();
	 	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
	 	// this will return an error 'Unable to locate element', have to switch to iframe first
	 	// driver.findElement(By.xpath("/html/body/button")).click();
	 	
	 	// .frame(int arg0) will take index of the frame
	 	// driver.switchTo().frame(arg0)
	 	
	 	// take id of iframe
	 	driver.switchTo().frame("iframeResult");
	 	driver.findElement(By.xpath("/html/body/button")).click();
	 	
	 	driver.switchTo().alert().accept(); // click on OK button
	 	String text = driver.findElement(By.xpath("/html/body/h2")).getText();
	 	System.out.println(text);
	 	
	 	driver.quit();
	 	
	}
}
