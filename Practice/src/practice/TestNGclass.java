package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGclass {

	String Base_URL = "http://mdev.divers-supply.com/";
	WebDriver driver;
	String Pth = System.setProperty("webdriver.chrome.driver","D:/TL/Softwares and Videos/Path/Practice/driver/chromedriver.exe");
      //String Pth = System.setProperty("webdriver.gecko.driver", "F://RK/Automation/Selenium/Selenium_Library_Files/Drivers/Firefox/selenium-firefox-driver.exe");
	
	@BeforeTest
	public void Ca_Env() {

		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(Base_URL);
	}

	
	
	@Test
	public void pop_up() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement wa = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("x-mark-icon")));
		wa.click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(), 'Log In')]")).click();
		driver.findElement(By.id("email")).sendKeys("rajeshkumar.r@innoppl.com");
		   driver.findElement(By.id("pass")).sendKeys("Testinno_qa");
		   driver.findElement(By.id("send2")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(), 'Create an Account')]")).click();
	
	}
	 
	 
	@Test
	public void Ver_hm_Title() {

		String Exp_tle = "Scuba Gear - Snorkeling Equipment - Largest Scuba Diving Equipment Selection - Divers Supply";
		String Act_tle = driver.getTitle();
		Assert.assertEquals(Exp_tle, Act_tle);
	}

	@Test
	public void welcome() {
		WebElement wel_div = driver.findElement(By.className("welcome-msg"));
		wel_div.isDisplayed();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//System.out.println("Welcome Divers! is appeared = " + wel_div);
	}

	@Test
	public void Left_header() {
		if (driver.findElement(By.xpath("//a[@href='/specials.html']")).isDisplayed()) {
		} else if (driver.findElement(By.xpath("//a[@href='/scuba/packages.html']")).isDisplayed()) {
		} else if (driver.findElement(By.xpath("//a[@href='/divers-supply-gift-card.html']")).isDisplayed()) {
		} else {
			System.out.println("Menu's in left header isn't appeared");

		}
	}

	@Test
	public void menu() throws InterruptedException {

		if (driver.findElement(By.xpath("//a[@href='http://mdev.divers-supply.com/scuba-gear.html']")).isDisplayed()) {
		} else if (driver.findElement(By.xpath("//a[@href='http://www.mdev.divers-supply.com/snorkeling.html']")).isDisplayed()) {
		} else if (driver.findElement(By.xpath("//a[@href='http://www.mdev.divers-supply.com/spearfishing-freediving.html']")).isDisplayed()) {
		} else if (driver.findElement(By.xpath("//a[@href='http://www.mdev.divers-supply.com/swim.html']")).isDisplayed()) {
		} else if (driver.findElement(By.xpath("//a[@href='http://www.mdev.divers-supply.com/photography.html']")).isDisplayed()) {
		} else if (driver.findElement(By.xpath("//a[@href='http://www.mdev.divers-supply.com/specials.html']")).isDisplayed()) {
		} else if (driver.findElement(By.xpath("//a[@href='http://www.mdev.divers-supply.com/scuba-lessons.html']")).isDisplayed()) {
		} else if (driver.findElement(By.xpath("//a[@href='http://www.mdev.divers-supply.com/brands/']")).isDisplayed()) {
		} else if (driver.findElement(By.xpath("//a[@href='/store-locations.html']")).isDisplayed()) {
		} else {
			System.out.println("Menu is not displaying");
			Thread.sleep(1000);
			
		}
	}

	
	@Test
	public void hover() {
		Actions action = new Actions(driver);
		WebElement hover_ele = driver.findElement(By.xpath("//a[@href='https://mdev.divers-supply.com/customer/account/login/']"));
		//action.moveToElement(hover_ele).moveToElement(driver.findElement(By.xpath("//a[@href='http://www.mdev.divers-supply.com/scuba-gear/watches.html']")));
		hover_ele.click();
		System.out.println("hover the element is");
	}

	@Test
	public void login() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement test = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Log In')]")));
		if (driver.findElement(By.id("search")) != null) {
		 test.click();
		} else {
			System.out.println("Element is not visible");
		}
		
		
			}
	
		
	@Test
	public void User() {
		driver.findElement(By.id("email")).sendKeys("rajeshkumar.r@innoppl.com");
		driver.findElement(By.id("pass")).sendKeys("Testinno_qa");
		driver.findElement(By.id("send2")).click();
	}

	
	 /** @Test public void Ver_log_Title() { String Log_exp_rlt = ""; String
	 * Log_act_rlt = driver.getTitle(); Assert.assertEquals(Log_act_rlt,
	 * Log_exp_rlt); }*/
	 

	@AfterTest
	public void endsession() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.quit();
	}
}
