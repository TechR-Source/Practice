package udemy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDriverParameterizationReusable2 extends DataDriverParameterization{

	
	
	public void openBrowser() throws IOException{
		comLogin();
		
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
		
	
	
	
	@Test
	public void confirmationMessage(){
		System.out.println("This is the confirmation message");
	}
	
	@Test(enabled=false)
	public void enableFalse(){
		System.out.println("Verify the enabled false concept");
	}
	

}
