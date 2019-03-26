package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;

public class Query {

	public static int e;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


			/*class Call{

			public void main(String []args){
			Query tr =new Query();
			tr.e = 200;
			System.out.println(e);
			}*/

			//class Call1{
//				public  void main(String[] args){
//				refence r =new refence();
//				r.e= 500;
//				}
			//	
			//	
			//}

//---------------------------------------------------------------------------------------		
		/*int a=1;
			if (a==13) {
				System.out.println("true");
			} else {
				System.out.println("false");
				
			}*/

//--------------------------------------------------------------------------------------------
			
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dev-goodstate.enterpriseapplicationdevelopers.com/");
		Thread.sleep(3000);

		WebElement wcPopup = driver.findElement(By.xpath("//*[@id='targetbay_email']"));
		//boolean ele = driver.findElement(By.xpath("//a[@title='Return Policy']")).isDisplayed();
		
		
		
		if (wcPopup.isDisplayed()) {
		//System.out.println("Popup is displaying");
		} else  {
		System.out.println("NO popup");

		}

	}}
		
		
		
	
