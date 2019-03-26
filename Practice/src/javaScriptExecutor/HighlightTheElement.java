package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightTheElement {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		
		WebElement ele = driver.findElement(By.xpath("//*[contains(text(),'Gmail')]"));
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
		
		
		WebElement eleImg = driver.findElement(By.xpath("//*[contains(text(),'Images')]"));
		
		js.executeScript("arguments[0].setAttribute('style','background:yellow; border: 1px solid green;');", eleImg);
		
	}

}


/*
It provides “executescript” & “executeAsyncScript” methods, to run JavaScript in the context of the currently selected frame or window.

What is the use of JavaScriptExecutor?
JavaScriptExecutor is an interface which provides a mechanism to execute Javascript through the Selenium WebDriver. It provides “executescript” and “executeAsyncScript” methods, to run JavaScript in the context of the currently selected frame or window. An example of that is:


JavascriptExecutor js = (JavascriptExecutor) driver; 
js.executeScript(Script,Arguments);

12. How to scroll down a page using JavaScript in Selenium?
We can scroll down a page by using window.scrollBy() function. Example:

1
((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
13. How to scroll down to a particular element?
To scroll down to a particular element on a web page, we can use the function scrollIntoView(). Example:

1
((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

*/