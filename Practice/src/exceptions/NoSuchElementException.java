package exceptions;

public class NoSuchElementException {

	
	
	
}


/*
 NoSuchElementException
 
 The second is that you need to do something on the page to make the element appear. 
 For example, the user selects Country and javascript populates a City field. If you attempt to look for a city before you select a country, 
 the city you are looking for does not exist and you get a NoSuchElementException. 
 To fix this you have to make sure the steps in your test are correct.
 
This exception occurs when WebDriver is unable to identify the elements during run time. 
Due to wrong selector or incorrect locator, which is, not exist.
Timing issue - Taken more than given time to identify the locator


Example:-

driver.findElement(By.id("invalidid")).sendKeys("Mukesh");

Solutions:

Using javascriptExecutor

To click on a hidden element, you can use execute_script with the parameter "arguments[0].click();"

Code example:

element = driver.find_element_by_xpath("//input[@id='firstname']")
driver.execute_script("arguments[0].click();", element)


*******************************************************************************************
ElementNotFound is a superclass and its sub classes are NoSuchElementException, 

*/
