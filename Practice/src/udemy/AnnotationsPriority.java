package udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationsPriority {

	@Test(enabled=false)
	public void loginPage() {
		System.out.println("This is the login page");
	}
	
	@Test()
	public void passRecoPage(){
		System.out.println("This is the recover page");
	}
	
	@Test(dependsOnMethods="passRecoPage")
	public void recoverPassword(){
		System.out.println("Recover Password");
		
		//Exception : .recoverPassword() depends on nonexistent method confirmationMessa
	}
	
	@Test(priority=-2)
	public void recoverPass(){
		System.out.println("Recover Recover is belongs to priority =  minus two");
	//Exception : recoverPass() is depending on method public void udemy.AnnotationsPriority.loginPage(), which is not annotated with @Test or not included.
	}
	
	@Test(priority=2)	
	public void forgotPassword(){
		System.out.println("This is the forgot password page = This is the second one");
	}
	
	@AfterTest
	public void afterExecute(){
		System.out.println("I will execute last");
	}
	
	@Test(priority=-1)	
	public void createAccountPage(){
		System.out.println("This is the Create An Account Page + Minus one");
	}

	
	@Test(priority=1)
	public void confirmationMessage(){
		System.out.println("This is the confirmation message " + "This is invocation Count + first one");
	}
	
	@Test(priority=0)
	public void enableFalse(){
		System.out.println("Verify the enabled false concept + Zero'th One");
	}
	

}
