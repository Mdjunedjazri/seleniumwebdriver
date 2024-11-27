package SelfAutomationLearning;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment1toFindLinkImage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://www.demoblaze.com/index.html");
		WebElement link =d.findElement(By.tagName("a"));
		System.out.println("Total number of Linksare:"+link.getSize());
		WebElement Image=d.findElement(By.tagName("img"));
		System.out.println("Total Number of Images are:"+Image);
		d.findElement(By.linkText("PRODUCT STORE ")).click();
		Thread.sleep(500);
		d.close();
	}
	

}
