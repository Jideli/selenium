import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotBase {

		public static void captureScreenshot(WebDriver driver, String screenshotName) throws Exception{
			TakesScreenshot ts = (TakesScreenshot)driver;
    	 	
    	 	// only saves it in memory here
    	 	File sourceFile = ts.getScreenshotAs(OutputType.FILE); 
    	 	
    	 	// define path to save it in our repository, dot means current folder
    	 	FileUtils.copyFile(sourceFile, new File(".\\Screenshots\\"+screenshotName+".jpeg")); 
    	 	
    	 
    	 	// --> execute script and refresh project
    	 	// file is now in new folder, right click on file, properties, show in system explorer button
    	 
		}
}
