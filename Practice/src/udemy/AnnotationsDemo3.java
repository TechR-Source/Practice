package udemy;

import java.util.Objects;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationsDemo3 {

	@Test
	public void productDetailPage() {
		System.out.println("This is the PDP page");
		}
	
	@Parameters({"URL"})
	@Test
	public void webPFPmainMenu(String fURL){
		System.out.println("This is the web Main Menu");
		System.out.println(fURL);
	}
	
	
	@Test(dataProvider="getData")
	public void dataPro(String uName, String uPwd){
		
		System.out.println(uName);
		System.out.println(uPwd);
	}
	
	
	@Test(groups={"Smoke"})
	public void webPDPsubmenu(){
		System.out.println("This is the Web sub menu");
	}

	@Test
	public void mobilePDPmainMenu(){
		System.out.println("This is the mobile Main Menu");
	}
	
	@Test
	public void mobilePDPsubmenu(){
		System.out.println("This is the mobile sub menu");
	}
	
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] obj = new Object[3][2];
		obj[0][0] = "FirstUserName";
		obj[0][1] = "FirstPassword";
		
		obj[1][0] = "SecondUserName";
		obj[1][1] = "SecondPassword";
				
		obj[2][0] = "ThirdUserName";
		obj[2][1] = "ThirdPassword";
		
		return obj;   	//Sending all the data values to the whatever test is needed
	}
}
