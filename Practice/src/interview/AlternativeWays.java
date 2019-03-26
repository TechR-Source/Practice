package interview;

public class AlternativeWays {


	
}


//AlternativeWays for sendkeys: 

/*
 	WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
	JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
	myExecutor.executeScript("arguments[0].value='Kirtesh';", searchbox);
 */


	
/*
	WebElement username = driver.findElement(By.id("username"));
	Actions performAct = new Actions(driver);
	performAct.sendKeys(username, "admin").build().perform();
*/