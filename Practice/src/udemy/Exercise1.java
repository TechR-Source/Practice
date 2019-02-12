package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement eleCheBox = driver.findElement(By.xpath("//*[@for='benz']"));
				eleCheBox.click();
				String cheVal = eleCheBox.getText();
				System.out.println(eleCheBox.getText());
	
				
				WebElement ddVal = driver.findElement(By.id("dropdown-class-example"));
				Select slt = new Select(ddVal);
				slt.selectByVisibleText(cheVal);
				
				
				driver.findElement(By.xpath("//input[@id='name']")).sendKeys(cheVal);
				
				
				driver.findElement(By.id("alertbtn")).click();
				
			String altText = driver.switchTo().alert().getText();
			if (altText.contains(cheVal)) {
				System.out.println(" Required text is found = " + altText);
			} else {
				System.out.println("not Found");
				
			}				
						
	}

}

