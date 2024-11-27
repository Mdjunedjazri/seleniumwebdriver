package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://the-internet.herokuapp.com/javascript_alerts");
	
		
		//Alert
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		d.switchTo().alert().accept();
		
		//Confirmation alert
		
		d.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		d.switchTo().alert().accept();
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		d.switchTo().alert().dismiss();
		
		
		
		//Prompt alert
		
		
		d.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
		Alert myalert=d.switchTo().alert();
		myalert.sendKeys("Hello");
		Thread.sleep(3000);
		myalert.accept();
		
		
	}

}
