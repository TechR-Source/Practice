package udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleHTTPCertificates {

	public static void main(String[] args) {
		
	
	FirefoxProfile firProfile = new FirefoxProfile();	
	firProfile.setAcceptUntrustedCertificates(true);
	//WebDriver fir = new FirefoxDriver(firProfile);	

	
	DesiredCapabilities desCapChr = new DesiredCapabilities();
	desCapChr.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//WebDriver driver = new ChromeDriver(desCapChr);
	
	
	DesiredCapabilities cpIE = new DesiredCapabilities();
	cpIE.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	System.setProperty("webdriver.ie.driver", "/.drivers/internetExplorerDriver.exe");
	//WebDriver driver1 = new InternetExplorerDriver(cpIE);
	
	
	}
}
