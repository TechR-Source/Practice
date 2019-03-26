package exceptions;

public class ElementNotVisibleException {

}


/*
ElementNotVisibleException

This Exception occurs when the element presence is in DOM, it is not visible.

Example:-
Hidden Elements, which has presence in DOM and it, is not visible. Visibility means the height and
width should be greater than zero. Hidden Elements are defined in HTML using of type=”hidden”.

driver.findElement(By.id("hiddenid")).sendKeys("Mukesh");
*/


//Solutions:

/*
  We shall go with explicitly Wait with VisibilityOfTheElemetLocated
  
  
  
  To click on a hidden element, you can use execute_script with the parameter "arguments[0].click();"

Code example:

element = driver.find_element_by_xpath("//input[@id='firstname']")
driver.execute_script("arguments[0].click();", element)
*/