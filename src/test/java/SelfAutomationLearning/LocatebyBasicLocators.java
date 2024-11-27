package SelfAutomationLearning;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LocatebyBasicLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.opencart.com/");
	
		d.manage().window().maximize();
		
	d.findElement(By.name("search")).sendKeys("mac");
	boolean Logo=d.findElement(By.id("logo")).isDisplayed();
	System.out.println(Logo);
	//d.findElement(By.linkText("Tablets")).click();
	//Thread.sleep(5000);
	//d.findElement(By.partialLinkText("Softwa")).click();
	//Thread.sleep(5000);
	List<WebElement >elements=d.findElements(By.className("PRODUCT STORE"));
	System.out.println("Total list of web Elements are:"+elements.size());
	
	List<WebElement> links=d.findElements(By.tagName("a"));
	System.out.println("Total Links Present are:"+links.size());
	
	List<WebElement> Img=d.findElements(By.tagName("img"));
	System.out.println("Number of Images present:Img:"+Img.size());
	d.close();
		
		
	}

}
