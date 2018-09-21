// used to find elements where attribute values change on page refresh
// based on an element's relation to another element like child, parent, ancestor, etc
// big advantage of XPath is you can go forward and backward
// based on email, move forward to find password field or vice versa going backwards


// Forward XPath Axes: following, following-sibling, descendant, child

// following: based on 1 element reference, identify the following elements
// in Inspector, copy XPath by right-clicking on HTML line and paste into field, then add "/following..."
// e.g. //*[@id='email']/following::input[@name='pass']
// or use position: //*[@id='email']/following::input[1]

// following-sibling: means on the same level e.g. 3 <select> tags inside <span>
// take id attribute in first select tag and then refer to sibling
// e.g. //*[@id='day']/following-sibling::select[@id='year']

// child: need to be direct/immediate child of the parent
// 3 select tags are children of span tag, which is child of another span tag with id attribute 'u_0_x'
// e.g. //*[id='u_0_x']/span/child::select[2]

// descendant: all children and grandchildren
// if you know female radio button is somewhere under the form tag: //*[@id='reg']/descendant::input[@type='radio']
// since there are two radio, add sibling with index reference: //*[@id='email']/following::input[@name='pass']/following-sibling::label[1]
// another way: 'jump generation': copy XPath of the form tag using double slash
// //*[@id='reg']//input[@name='reg_email_']



// Backward/Reverse XPath Axes: parent, ancestor, preceding-sibling

// parent: identify tag directly above in hierarchy
// e.g. div is parent of mobile number text field: //input[@name='reg_email_']/parent::div

// ancestor: allows to identify grandparents 
// e.g. identify the form (only one form tag): //input[@name='reg_email_']/ancestor::form

// preceding: move backward to identify preceding element
// e.g. based on mobile number field, identify first name field by refering to tag and unique attribute name: //input[@name='reg_email_']/preceding::input[@name='firstname']

// preceding-sibling: identify previous element on same level
// e.g. based on year drop down, identify day drop down: //input[@id='year']/preceding-sibling::select[@id='day']



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel13_XPathAxes {

     public static void main(String[] args){
    	 	System.setProperty("webdriver.chrome.driver", "/Users/Manon/Documents/selenium-java-3/chromedriver");
    	 	WebDriver driver = new ChromeDriver();
    	 	driver.get("http://www.google.com");
    	 	System.out.println("Google launched in Chrome Browser");
    }
}
