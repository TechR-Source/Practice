package interview;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import udemy.Screenshot;

public class ScreenShotsFull {

	
	public static void main(String[] args) throws IOException{
		
		
	
	

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://naukri.com");
		
	
	
	AShot aSht = new AShot();
	//Screenshot sc = aSht.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	//ImageIO.write(sc.getImage(), "PNG", new File("D:\\FullPageScreenshot.png"));
	
	
	
	
	        
				}
			}
			
		


