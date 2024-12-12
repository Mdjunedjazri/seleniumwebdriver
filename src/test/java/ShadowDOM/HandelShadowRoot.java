package ShadowDOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelShadowRoot {
	
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.manage().window().maximize();
		d.get("https://selectorshub.com/iframe-in-shadow-dom/");
		/*SearchContext ParentRoot=d.findElement(By.cssSelector("#userName")).getShadowRoot();
		System.out.println(ParentRoot);
		SearchContext childroot=ParentRoot.findElement(By.cssSelector("#concepts")).getShadowRoot();
		System.out.println(childroot);
		
		WebElement root=childroot.findElement(By.cssSelector("#training"));
		System.out.println("root is "+root.isEnabled());
		System.out.println(root);
		root.sendKeys("hello");
		
		*
		*SearchContext pizza=driver.findElement(By.cssSelector("#userName")).getShadowRoot(); 	
		SearchContext ap=pizza.findElement(By.cssSelector("#app2")).getShadowRoot(); 	
		SearchContext ap1=pizza.findElement(By.cssSelector("#concepts")).getShadowRoot(); 
		WebElement pi=	ap1.findElement(By.cssSelector("#training")); 	
		pi.sendKeys("CornPizza");
		WebElement shadowHost = driver.findElement(By.cssSelector("shadowHost"));
		WebElement shadowRoot = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowHost);
		WebElement shadowElement = shadowRoot.findElement(By.cssSelector("shadowElement")); 
		*/
		
		/*
		WebElement shadowHost = d.findElement(By.cssSelector("#userName"));
		WebElement shadowRoot = (WebElement) ((JavascriptExecutor) d).executeScript("return arguments[0].shadowRoot", shadowHost);
		WebElement shadowElement = shadowRoot.findElement(By.cssSelector("shadowElement"));
		
		shadowElement.sendKeys("hello");
		*/
	}

}
