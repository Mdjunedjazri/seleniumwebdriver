package BrokerLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrokenLink {
	private static final String HttpURLConnection = null;

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		//capture all the links 
		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		int brokenLink=0;
		
		for (WebElement link:links) {
			String linkref=link.getAttribute("href");
			if (linkref==null || linkref.isEmpty()) {
				System.out.println("href value is null so not able to check ");
			continue;
			}
		
			try {
			
			
			// hit URL to server 
				URL linkURL=new URL  (linkref); // convert href valued to from string to url
				HttpURLConnection conn=(HttpURLConnection) linkURL.openConnection(); // open the connection to the server 
				conn.connect();
				
				if (conn.getResponseCode()>=400) {
					System.out.println(linkref+"---------------------Broken Link");
					brokenLink++;
				}else {
						System.out.println(linkref+"---------------------Not Broken Link");
					}
			
			}
			catch(IOException e)
			{ 	
			}
			
			
			}
		System.out.println("number of broken links"+brokenLink);
	}
	
	}


