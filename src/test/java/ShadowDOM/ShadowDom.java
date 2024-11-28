package ShadowDOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowDom {
	public static void main(String[] args) throws InterruptedException { 		
				 		
		WebDriver driver=new ChromeDriver(); 		
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/"); 		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//to handleshadow dom

		SearchContext pizza=driver.findElement(By.cssSelector("#userName")).getShadowRoot();
	    SearchContext ap=pizza.findElement(By.cssSelector("#app2")).getShadowRoot();
	    WebElement pi=	ap.findElement(By.cssSelector("#pizza"));
	    pi.sendKeys("CornPizza");
	    Thread.sleep(3000);
	    pi.click();
	    Actions as=new Actions(driver);
	    as.keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys("hello");
		

		
}
}
