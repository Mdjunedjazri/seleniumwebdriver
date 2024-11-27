package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		
	
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
	d.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	
	d.switchTo().frame("iframeResult");
	WebElement box1=d.findElement(By.id("field1"));
	//WebElement box2=d.findElement(By.id("field2"));
	WebElement button=d.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	
	box1.clear();
	box1.sendKeys("Hi");
	Actions ach=new Actions(d);
	ach.doubleClick(button).perform();
	

}
}
