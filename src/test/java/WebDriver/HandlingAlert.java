package WebDriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
	d.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	
	//Normal Alert with ok 
	/*
	d.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	Alert MyAlert=d.switchTo().alert();
	System.out.println(MyAlert.getText());
	Thread.sleep(3000);
	MyAlert.accept();
	*/
	
	//Alert with OK and Cancel
	/*
	d.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	Alert ConAlert=d.switchTo().alert();
	ConAlert.dismiss();
	Thread.sleep(3000);
	d.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	Alert ConAlert1=d.switchTo().alert();
	ConAlert1.accept();
	
	*/
	
	
	// Alert With Text 
	
	d.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	Alert myAlert=d.switchTo().alert();
	myAlert.sendKeys("Mohammedjunedjazri");
	myAlert.accept();
	Thread.sleep(3000);
	d.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	Alert myAlert1=d.switchTo().alert();
	myAlert1.sendKeys("Mohammedjunedjazri");
	myAlert1.dismiss();
	
	
	
}
}
