// XPath = XML Path Language
// Syntax: <HTML tAG>[@attribute='value']
// helps find element via DOM (Document Object Model)

// download Chrome XPath Helper add on / Ctrl+Shift+X to activate in browser / press Shift and move cursor to desired object

// '/' represents absolute XPath, helps us locate element from root node
// e.g. /html/body/div/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input

// '//' represents relative XPath
// can be entered in Chrome XPath Helper, number of results will show and object will be highlighted
// e.g. //input[@name='email']
// or search 2 attributes within input tag: //input[@name='email][@type='email']
// or use an operator: //input[@name='email] and [@type='email']
// or search whole DOM structure with wildcard: //*[@name='email][@type='email']

// another Add On is Eskry for Chrome / new tab Eskry is created in Inspector / click on target icon and click on object to inspect
// click on object name which appears and XPath can be edited in new section 'Locator Info' and save
// click on Test button to check if correctly identified, Eskry will highlight object with red dotted frame

public class Sel11_BasicsOfXPath {

	
	
}
