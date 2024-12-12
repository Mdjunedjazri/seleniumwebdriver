package Practice9_12;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Explisitwaitt {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	//	WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
	// mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='sunday']")));
		
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		.withTimeouts(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(10))
		.ignoring(NoSuchElementExeptions.class);
	
	
	}

	
		
	}

}
