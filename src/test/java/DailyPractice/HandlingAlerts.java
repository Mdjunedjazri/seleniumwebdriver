package DailyPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d =new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		d.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		Thread.sleep(3000);
		d.switchTo().alert().accept();
		
		
		WebElement button=d.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']"));
		button.click();
		Thread.sleep(3000);
		d.switchTo().alert().accept();
		
		button.click();
		Thread.sleep(3000);
		d.switchTo().alert().dismiss();
		
		
		WebElement alert=d.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']"));
		alert.sendKeys("Hello Juned");          ////button[@onclick='myFunctionPrompt()']
		Thread.sleep(3000);
		d.switchTo().alert().accept();
		
		alert.click();
		Thread.sleep(3000);
		d.switchTo().alert().dismiss();
		Thread.sleep(3000);
	
		d.quit();
		
	}

}
