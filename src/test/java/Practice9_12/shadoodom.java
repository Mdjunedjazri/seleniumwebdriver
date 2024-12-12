package Practice9_12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shadoodom {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); 		
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/"); 		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Thread.sleep(1000);
		SearchContext Element=driver.findElement(By.cssSelector("#userName")).getShadowRoot();
		SearchContext Element1=Element.findElement(By.cssSelector("#app2")).getShadowRoot();
		Element1.findElement(By.cssSelector("#pizza")).sendKeys("Tea");
		Actions as =new Actions(driver);
		as.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		as.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	

		as.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		as.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	}

}
