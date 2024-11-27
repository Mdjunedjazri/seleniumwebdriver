package ShadowDOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom1 {
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://dev.automationtesting.in/shadow-dom");
		
		// single shadow root 
		/*
		SearchContext shadow=d.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		shadow.findElement(By.cssSelector("#shadow-element")).click();
		*/
		
		/*
		// multiple shadow root 
		SearchContext shadow=d.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		SearchContext shadow1=shadow.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		shadow1.findElement(By.cssSelector("SearchContext")).click();
		*/
		
		//nested shadow 
		SearchContext shadow=d.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		SearchContext shadow1=shadow.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		SearchContext shadow2=shadow1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		shadow2.findElement(By.cssSelector("#multi-nested-shadow-root")).click();
		
		
		
	}
	

}
