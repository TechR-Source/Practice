package exceptions;

public class ElementNotClickable {

	public static void main(String[] args) {

		
		/*
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", Webelement); 
		
		
		
		
		Actions:
		
		WebElement element = driver.findElement(By("element"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		
		
		
		
		*********************************************************************************
		
		Consider below scenario:
		
You have a social media application similar to Facebook.
You need to sign up. When you signup you are navigated to home page and a toaster message appears stating signup is successful.
You need to click on logout. Logout button is present in right top corner where toaster message also appears.
When we do above flow, when we want to click on Logout button, you might get above exception as Logout button is overlapped by toaster message. 
Webdriver will not be able to click on Logout button and throws a perfect exception stating other element would receive the click.

Solution:

You need to wait till toaster message disappears. And we know how to wait in selenium.

To solve above issue, You must use wait provided by selenium. Now you will ask which wait we should use?

Thread.sleep(value): It is not advisable. You never know how much time you need to make webdriver sleep. It might increase your test execution time drastically and would not serve purpose always.
Implicit wait: This will not work always. Implicit wait will make webdriver wait till it does not find it. Here issue is that webdriver finds web element but could not click on it or element i snot visible. Implicit wait can not stop webdriver once web element is found. This wait does not bother if element is displayed or not.
Explicit wait: This is called dynamic wait and we should use it. ExpectedConditions class provides so many condition till you want to wait. We have condition which we can use to wait till element is displayed. It will make webdriver wait till element is displayed on UI not till the time element is found.
Sample code:

                WebDriverWait wait= new WebDriverWait(driver,15);
                wait.until(ExpectedConditions.visibilityOf(element));

4.  Fluent wait: This is the best wait I feel. It provides you flexibility to create your own condition to wait for.
		
		
		
		
		
		
		 */
	}

}
