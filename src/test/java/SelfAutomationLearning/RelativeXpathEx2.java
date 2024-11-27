package SelfAutomationLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathEx2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
	/*	d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		Thread.sleep(10000);
		d.findElement(By.xpath("//input[@name='q'][@id='small-searchterms']")).sendKeys("Book");
		d.findElement(By.xpath("//input[@type='submit']")).click();
		//d.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button'][@type='submit']")).click();
		Thread.sleep(3000);
		d.close(); */
		
		d.get("https://demo.opencart.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[text()='MacBook']")).click();
		
	}
	

}
