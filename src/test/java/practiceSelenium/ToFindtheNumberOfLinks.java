package practiceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindtheNumberOfLinks {
	
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		
		// total number of links 
		List<WebElement> links=d.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		//print title of the page 
		System.out.println(d.getTitle());
		
		// print page URL
		System.out.println(d.getCurrentUrl());
		
		//print page source h
		//System.out.println(d.getPageSource());
		
		d.quit();
		
		
	}

}
