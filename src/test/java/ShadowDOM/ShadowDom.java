package ShadowDOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {
	public static void main(String[] args) { 		
				 		
		WebDriver driver=new ChromeDriver(); 		
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/"); 		
		driver.manage().window().maximize(); 		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 		
		//to handleshadow dom 		 	
		SearchContext pizza=driver.findElement(By.cssSelector("#userName")).getShadowRoot(); 	
		SearchContext ap=pizza.findElement(By.cssSelector("#app2")).getShadowRoot(); 	
		SearchContext ap1=pizza.findElement(By.cssSelector("#concepts")).getShadowRoot(); 
		WebElement pi=	ap1.findElement(By.cssSelector("#training")); 	
		pi.sendKeys("CornPizza"); 
		

		
}
}
