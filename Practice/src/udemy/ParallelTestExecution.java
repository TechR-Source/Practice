package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestExecution {

	WebDriver driver;
	
	//@Test
	@Parameters("browser")
	public void invokeBrowser(String browserName){
		
	if(browserName.equalsIgnoreCase("chrome")){
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		
	} else if(browserName.equalsIgnoreCase("firefox")){
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		 driver = new FirefoxDriver();
		
	} else if(browserName.equalsIgnoreCase("ie")){
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		 driver = new InternetExplorerDriver();	
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
		
	}
	
	
	
	}

