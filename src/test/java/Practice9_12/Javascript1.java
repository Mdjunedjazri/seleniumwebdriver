package Practice9_12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {
	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement nameTF=driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));
		WebElement minslider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].setAttribute('value', 'Juned')", nameTF);
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', 'Mohammed')", nameTF);
		
		js.executeScript("arguments[0].scrollIntoView();", minslider);
		//js.executeScript("arguments[0].scrollIntoView();", element );
		
		
		
		
		
	
		
		
		
	}

}
