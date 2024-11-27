package DailyPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehovers {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d =new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		WebElement pointme=d.findElement(By.xpath("//button[@class='dropbtn']"));
	
		
		
		WebElement value1=d.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
		
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView();", pointme);
				
	
		
		Actions as=new Actions(d);
		
		Thread.sleep(3000);
		as.moveToElement(pointme).moveToElement(value1).click().build().perform();
		
		
		
		//d.quit();
		
	}
	
	
}
