package udemy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {

		WebDriver driver;
		
		String homePage = "https://www.compressorparts.com/";
        //String url = "";
        //HttpURLConnection htCon = null;
        //int respCode = 200;
        
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get(homePage);
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
            String url = it.next().getAttribute("href");
            
            System.out.println(url);
        
            if(url == null || url.isEmpty()){
            	System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            
            if(!url.startsWith(homePage)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }
            
            
            	HttpURLConnection htCon = (HttpURLConnection)(new URL(url).openConnection());  //HttpURLConnection class has methods to send HTTP request and capture HTTP response code. 
            																				   //So, output of openConnection() method (URLConnection) is type casted to HttpURLConnection.
                
            					htCon.setRequestMethod("HEAD");	//We can set Request type as "HEAD" instead of "GET". So that only headers are returned and not document body.
                
            					htCon.connect();					//On invoking connect() method, actual connection to url is established and the request is sent.
                
                int respCode = htCon.getResponseCode();				//Using getResponseCode() method we can get response code for the request
                
                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }   
	}
	}
}
