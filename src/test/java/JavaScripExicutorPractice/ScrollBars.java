package JavaScripExicutorPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBars {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js =(JavascriptExecutor)d;
		
		
		//1 scroll the page down by pixel
		
		js.executeScript("window.scrollBy(0, 1000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(3000);
		//2 scroll the page by visible element 
		
		WebElement element=d.findElement(By.xpath("//h2[normalize-space()='Upload Files']"));
		js.executeScript("arguments[0].scrollIntoView();", element );
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(3000);
		
		//3 scroll the to the end 
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(3000);
		
		//4 scroll to initial page
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		// Zoom in and Zoom Out
		js.executeScript("document.body.style.zoom='200%'");
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='50%'");
		
	
		
		
		
	}

}
