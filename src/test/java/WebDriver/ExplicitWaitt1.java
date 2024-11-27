package WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitt1 {

	public static void main(String[] args) {
	WebDriver d = new ChromeDriver();
	WebDriverWait mywait= new WebDriverWait(d,Duration.ofSeconds(20));
	//d.get("https://demowebshop.tricentis.com/");
	d.navigate().to("https://demowebshop.tricentis.com/");
	d.manage().window().maximize();
	WebElement e =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("(//a)[6]")));
	e.click();
	
	

	}

}
