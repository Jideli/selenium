
// how to locate web elements using CSS selector
// CSS is faster and simpler than XPath
// tagname[attribute=value] e.g. input[name=reg_password_]
// or use hashtag: tagname#value e.g. input#email (# represents id, just add attribute value)
// or just #email can work

// use dot as class attribute: tagname.value e.g. input.inputtext
// or tagname.classname[attribute=value] e.g. input.inputtext[name=email]

// multiple attributes and values: input[type=email][name=email]

// partially locate using CSS:
// starts-with (xpath) is represented by ^ e.g. tagname[attribute ^= value] --> e.g. input[name^=first]
// ends-with (xpath) is represented by $ e.g. tagname[attribute $= value] --> e.g. input[autocomplete$=password]
// contains (xpath) is represented by * e.g. tagname[attribute *= value] --> e.g. input[autocomplete*=word]

// with CSS you can only move forward
// move forward as follows: html>body>div e.g. #reg>div>div
// but if path changes, it will no longer work

// when you want to identify a grandchild element just enter a space: #reg>div select

// to identify 3rd sibling: #reg>dic select:nth-of-type(3)

// identify last child element: #reg>div select:last-child



public class Sel14_cssSelector {
	
}






