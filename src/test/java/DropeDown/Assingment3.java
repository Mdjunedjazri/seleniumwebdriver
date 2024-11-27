package DropeDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment3 {
	
	//multiselect dropdown
	public static void main(String[] args) throws InterruptedException {
		WebDriver d =new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(4000);
		d.findElement(By.xpath("//div[6]//select[1]//option[1]")).click();
		d.findElement(By.xpath("//div[6]//select[1]//option[2]")).click();
		d.findElement(By.xpath("//div[6]//select[1]//option[3]")).click();
		d.findElement(By.xpath("//div[6]//select[1]//option[4]")).click();
		//d.findElement(By.xpath("//options[@value='green']")).click();
		
	}

}
