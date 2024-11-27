package TestNGPractice;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class lounchingBrowser {
	
	WebDriver d;
	
	
	// Lunching of url
	@Test(priority=1) 
	void openApp () {
		
	d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
	d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		
	}
	
	//Validate logo 
	@Test(priority=2)
	void validate() throws InterruptedException
	{
		Thread.sleep(3000);
		Boolean logo=d.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println(logo);
	}
	
	
	// login
	@Test (priority=3)
	
	void login() throws InterruptedException {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	
	
	
	
	// closing the App
	@Test(priority=4)
	void close() {
		d.quit();
	}

	
	
}
