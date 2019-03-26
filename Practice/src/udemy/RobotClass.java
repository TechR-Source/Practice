package udemy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {

		// opening Chrome browser
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					ChromeDriver driver = new ChromeDriver();
					
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
					// maximize the browser
					driver.manage().window().maximize();
					// load the browser with url
					driver.get("https://www.naukri.com/");
					
					driver.findElementById("input_resumeParser").click();

					Thread.sleep(10000);

					// Store the copied text in the clipboard
					StringSelection stringSelection = new StringSelection("C:\\Users\\innoppl\\Desktop\\Mob.pdf");
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
					
					Robot robotClass = new Robot();
					
					robotClass.keyPress(KeyEvent.VK_CONTROL);
					robotClass.keyPress(KeyEvent.VK_V);
					
					robotClass.keyRelease(KeyEvent.VK_CONTROL);
					robotClass.keyRelease(KeyEvent.VK_V);
					
					Thread.sleep(3000);
					
					
					robotClass.keyPress(KeyEvent.VK_ENTER);
					robotClass.keyRelease(KeyEvent.VK_ENTER);
					
					
		
	}

}
