package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbandonedPopup {

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "D:/TL/Softwares and Videos/Path/drivers/chromedriver.exe");	
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://dev-goodstate.enterpriseapplicationdevelopers.com");
    Thread.sleep(6000);
    driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']")).click();
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,400)", "");
    driver.findElement(By.xpath("(//a[@class='link_cart1'])[2]")).click();
    Thread.sleep(6000);
//    Point coordinates = driver.findElement(By.id("ctl00_portalmaster_txtUserName")).getLocation();
//    Robot robot = new Robot();
//    robot.mouseMove(coordinates.getX(),coordinates.getY()+120);
//    
    
	}

}
