package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RigthClickAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement Button=d.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions ach=new Actions(d);
		
		//right click action
		ach.contextClick(Button).perform();
		//clicking on copy 
		d.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		Thread.sleep(3000);
		// handling the alert 
		d.switchTo().alert().accept();
		
		
	}

}
