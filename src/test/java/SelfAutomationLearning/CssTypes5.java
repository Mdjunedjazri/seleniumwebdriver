package SelfAutomationLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class CssTypes5 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d= new ChromeDriver();
		d.get("https://en-gb.facebook.com/login/");
		d.manage().window().maximize();
		Thread.sleep(4000);
		d.findElement(By.cssSelector("input#email")).sendKeys("8880662333");
		d.findElement(By.cssSelector("input#pass")).sendKeys("Mdjuned@95");
		d.findElement(By.cssSelector("button#loginbutton")).click();
		Thread.sleep(4000);
	
	}

}
