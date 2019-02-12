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

public class DataDriverParameterization {

	public WebDriver driver=null;
	
	@Test
	public void comLogin() throws IOException {
	
	Properties prob = new Properties();
	FileInputStream fis = new FileInputStream("D:\\TL\\Softwares and Videos\\POM-Latest\\Path-Ref\\Practice\\src\\udemy\\inputData.properties");
  	prob.load(fis);
  	if (prob.getProperty("browser").equals("firefox")) {
  		 driver = new FirefoxDriver();
  	} else if(prob.getProperty("browser").equals("chrome")) {
  		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
  		 driver = new ChromeDriver();
  	} else  {
  		 driver = new InternetExplorerDriver();
  	}		
  //	System.out.println(prob.getProperty("username"));
  	driver.get(prob.getProperty("url"));
	}
	
	
	
	
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
		
	
	@Parameters({"URL"})
	@Test
	public void fetchURL(String fetURL){
		System.out.println("Fetch the current URL");
		System.out.println(fetURL);
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
