package udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {

	@Test(timeOut=3000)
	public void loginPage() {
		System.out.println("This is the login page");
	}
	
	
	@Test(dependsOnMethods={"loginPage", "confirmationMessage"})	
	public void forgotPassword(){
		System.out.println("This is the forgot password page");
	}
	
	@AfterTest
	public void afterExecute(){
		System.out.println("I will execute last");
	}
	
	@Test(groups={"Smoke"})	
	public void createAccountPage(){
		System.out.println("This is the Create An Account Page");
	}
		
	@Test(invocationCount=2)
	public void innoCnt(){
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	}
	
	@Parameters({"URL"})
	@Test
	public void fetchURL(String fetURL){
		System.out.println("Fetch the current URL");
		System.out.println(fetURL);
	}
	
	@Test(invocationCount=3)
	public void confirmationMessage(){
		System.out.println("This is the confirmation message " + "This is invocation Count");
	}
	
	@Test(enabled=false)
	public void enableFalse(){
		System.out.println("Verify the enabled false concept");
	}
	

}
