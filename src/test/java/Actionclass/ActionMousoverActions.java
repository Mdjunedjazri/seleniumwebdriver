package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMousoverActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://demo.opencart.com/");
		WebElement Desktop=d.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac=d.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		Actions act =new Actions(d);
	
		Thread.sleep(3000);
		act.moveToElement(Desktop).moveToElement(mac).click().build().perform();
		
	}

}
