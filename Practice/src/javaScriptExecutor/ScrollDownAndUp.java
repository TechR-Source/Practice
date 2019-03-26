package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;

public class ScrollDownAndUp {

	public static void main(String[] args) {

		/*
		 
		 
		 ScrollDown:
		 
		         JavascriptExecutor js = (JavascriptExecutor) driver;
		        WebElement Element = driver.findElement(By.linkText("Linux"));
		                js.executeScript("arguments[0].scrollIntoView();", Element);
		                
		                
		                or
		                
		                js.executeScript("window.scrollTo(0, document.body.scrollHeight);");



				"arguments[0]" means first index of page starting at 0.
				Where an " Element " is the locator on the web page.
				
				

		ScrollUp:
		
				        JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
						
						"document.body.scrollHeight" returns the complete height of the body i.e web page.
		 
		 */
	
	}

}
