package practiceSelenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsPractice {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
	  WebElement e =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		
		
	   /* Wait<WebDriver> wait =
	            new FluentWait<>(driver)
	                .withTimeout(Duration.ofSeconds(2))
	                .pollingEvery(Duration.ofMillis(300))
	                .ignoring(ElementNotInteractableException.class);
		
		   wait.until(
	            d -> {
	              revealed.sendKeys("Displayed");
	              return true;
	            });
		
		
	    */
	    
	    
	    Wait<WebDriver> wait=
	    		new FluentWait<WebDriver>(driver)
	    		.withTimeout(Duration.ofSeconds(2))
	    		.pollingEvery(Duration.ofSeconds(3))
	    		.ignoring(NoSuchElementException.class);
	    
	    WebElement UN=mywait.until(new Function<WebDriverElement  >)
		
	 
		
	}

	

	

}
