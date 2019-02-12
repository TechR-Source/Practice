package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.divers-supply.com/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		//driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']")).click();
		/*driver.findElement(By.xpath("(//input[@id='search'])[1]")).sendKeys("Swim caps");
		WebElement clkEle = driver.findElement(By.xpath("//input[@id='search'])[1]"));
		clkEle.sendKeys(Keys.ENTER);*/
		 
		WebElement ele = driver.findElement(By.xpath("(//a[@class='nav-a relative-level1 level-top nav-a-with-toggler nav-a-level0'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		act.click(driver.findElement(By.linkText("Dive Suits"))).build().perform();
		JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
		scrollDown.executeScript("window.scrollBy(0,1500)");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@title='Sharkskin Chillproof Long Sleeve Rash Guard Shirt'])[3]"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='attributepages-parent-link']")).click();
		
		
		/*driver.findElement(By.xpath("//img[@id='product-collection-image-64518']")).click();
		WebElement clrdrop = driver.findElement(By.xpath("//select[@id='attribute136']"));
		Select clrdp = new Select(clrdrop);
		clrdp.selectByIndex(1);
		List<WebElement> cnt = clrdp.getOptions();
		int iSize=cnt.size();
		
		for (int i = 0; i < iSize; i++) {
			String val = cnt.get(i).getText();
			System.out.println(val);
	
			driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
			driver.findElement(By.xpath("//button[@class='ajaxpro-viewcart-button ajaxpro-button button']")).click();
			//driver.findElement(By.id("//button[@class='targetbay_close targetbay_close_center']")).click();
			driver.findElement(By.xpath("(//button[@class='button btn-proceed-checkout btn-checkout'])[2]")).click();

			*/
		
		/*
		System.setProperty("webdriver.chrome.driver", "D:/TL/Softwares and Videos/Path/Practice/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.divers-supply.com/scuba-gear/bags-apparel/scubapro-mesh-sack-2016.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']")).click();
		driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
		 
		WebElement clrdrop = driver.findElement(By.xpath("//select[@id='attribute92']"));
		Select clrdp = new Select(clrdrop);
		//clrdp.selectByIndex(1);
		List<WebElement> cnt = clrdp.getOptions();
		int iSize=cnt.size();
		
		for (int i = 0; i < iSize; i++) {
			String val = cnt.get(i).getText();
			System.out.println(val);
			*/
		}
		
	}


