package udemy;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationsDemo2 {

	
	@Test
	public void homePage() {
		System.out.println("This is the home page");
	}
	
	@Test
	public void headerBlock(){
		System.out.println("This is the header block");
	}
	
	@BeforeTest
	public void beforeExecute(){
		System.out.println("I will execute first");
		
	}
	
	@Test(groups={"Smoke"})
	public void bannerBlock(){
		System.out.println("This is the banner block");
	}
	
	@Test
	public void contentBlock(){
		System.out.println("This is the content block");
	}

	@Parameters({"URL","userName"})
	@Test
	public void footerBlock(String feURL, String uName){
		System.out.println("This is the footer block");
		System.out.println(feURL);
		System.out.println(uName);
	}
}
