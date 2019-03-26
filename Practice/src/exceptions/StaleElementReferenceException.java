package exceptions;

public class StaleElementReferenceException {

}

//StaleElementReferenceException : element is not attached to the page document

//Note: Dom is getting refreshed which means no values in the dom


/*
StaleElementReferenceException
This Exception occurs when the Element belongs to a different frame than the current one. The user has navigated away to another page.

Example:-
WebElement element=driver.findElement(By.id("username"));// Element is available in parent window
driver.switchTo().window(Child_Window);//Switch to Child Window
element.sendKeys("Mukesh");//perform the action on the element which is not visible in the child window

*/